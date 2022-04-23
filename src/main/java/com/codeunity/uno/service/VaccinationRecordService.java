package com.codeunity.uno.service;


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
    
}
