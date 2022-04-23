package com.codeunity.uno.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccination_record")
public class VaccinationRecordEntity {
    
    @Id
    @GeneratedValue
    private Long id;
    
    //PERSONAL DETAILS OF VACCINATED PERSON
    private String identificationNumber;
    private String firstName;
    private String lastName;
    private String address;
    private String city;

    //VACCINE DETAILS
    private String serialNumber;
    private Long dose;
    @Enumerated(EnumType.STRING)
    private VaccineBrand brand;
    public Long getId() {
        return id;
    }
    public String getIdentificationNumber() {
        return identificationNumber;
    }
    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Long getDose() {
        return dose;
    }
    public void setDose(Long dose) {
        this.dose = dose;
    }
    public VaccineBrand getBrand() {
        return brand;
    }
    public void setBrand(VaccineBrand brand) {
        this.brand = brand;
    }

    
}
