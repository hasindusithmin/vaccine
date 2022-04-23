package com.codeunity.uno.service;


import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.codeunity.uno.model.VaccinationRecordEntity;
import com.codeunity.uno.repositary.VaccinationRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationRecordService {

    @Autowired
    private  VaccinationRecordRepository vaccinationRecordRepository;

    public VaccinationRecordEntity create(VaccinationRecordEntity vaccinationRecordEntity){
        return vaccinationRecordRepository.save(vaccinationRecordEntity);
    }
    
    public List<VaccinationRecordEntity> read(){
        return vaccinationRecordRepository.findAll();
    }

    public VaccinationRecordEntity read(int id){
        return vaccinationRecordRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
