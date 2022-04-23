package com.codeunity.uno.controller;

import java.util.List;

import com.codeunity.uno.model.VaccinationRecordEntity;
import com.codeunity.uno.service.VaccinationRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<VaccinationRecordEntity> getALL(){
        return vaccinationRecordService.read();
    }

    @PostMapping
    public VaccinationRecordEntity addOne(@RequestBody VaccinationRecordEntity vaccinationRecordEntity){
        return vaccinationRecordService.create(vaccinationRecordEntity);
    }

}
