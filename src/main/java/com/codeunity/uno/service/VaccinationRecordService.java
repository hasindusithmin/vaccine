package com.codeunity.uno.service;


import java.util.List;
import java.util.Optional;

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

    public VaccinationRecordEntity update(VaccinationRecordEntity vaccinationRecordEntity,int id) {
        VaccinationRecordEntity vaccination_record_entity = vaccinationRecordRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        vaccination_record_entity.setIdentificationNumber(vaccinationRecordEntity.getIdentificationNumber());
        vaccination_record_entity.setFirstName(vaccinationRecordEntity.getFirstName());
        vaccination_record_entity.setLastName(vaccinationRecordEntity.getLastName());
        vaccination_record_entity.setAddress(vaccinationRecordEntity.getAddress());
        vaccination_record_entity.setCity(vaccinationRecordEntity.getCity());
        vaccination_record_entity.setSerialNumber(vaccinationRecordEntity.getSerialNumber());
        vaccination_record_entity.setDose(vaccinationRecordEntity.getDose());
        vaccination_record_entity.setBrand(vaccinationRecordEntity.getBrand());
        return vaccinationRecordRepository.save(vaccination_record_entity);
    }

    public void detele(int id) {
        VaccinationRecordEntity vaccinationRecordEntity = vaccinationRecordRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        vaccinationRecordRepository.delete(vaccinationRecordEntity);
    }
}
