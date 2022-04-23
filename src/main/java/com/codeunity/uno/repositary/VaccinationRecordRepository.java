package com.codeunity.uno.repositary;

import com.codeunity.uno.model.VaccinationRecordEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRecordRepository extends JpaRepository<VaccinationRecordEntity,Integer> {
    
}
