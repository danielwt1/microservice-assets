package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;


import javax.persistence.Entity;
import java.time.LocalDateTime;
@Entity
public class Monitor extends Technology {

    private short inches;

    public Monitor() {
    }

    public Monitor(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String brand, String location, String detail, LocalDateTime warrantyExpirationDate, String warrantyDetail, short inches) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, brand, location, detail, warrantyExpirationDate, warrantyDetail);
        this.inches = inches;
    }

    public short getInches() {
        return inches;
    }

    public void setInches(short inches) {
        this.inches = inches;
    }
}
