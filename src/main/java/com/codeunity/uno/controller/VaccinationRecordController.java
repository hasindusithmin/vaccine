package com.codeunity.uno.controller;

import java.util.List;

import com.codeunity.uno.model.VaccinationRecordEntity;
import com.codeunity.uno.service.VaccinationRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vaccination")
@CrossOrigin
public class VaccinationRecordController {
    
    @Autowired
    private VaccinationRecordService vaccinationRecordService;

    @GetMapping
    public ResponseEntity<List<VaccinationRecordEntity>> getALL(){
        return ResponseEntity.ok(vaccinationRecordService.read());
    }

    @PostMapping
    public ResponseEntity<VaccinationRecordEntity> addOne(@RequestBody VaccinationRecordEntity vaccinationRecordEntity){
        return new ResponseEntity<>(vaccinationRecordService.create(vaccinationRecordEntity),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VaccinationRecordEntity> getOne(@PathVariable int id) {
        return ResponseEntity.ok(vaccinationRecordService.read(id));
    }

}
