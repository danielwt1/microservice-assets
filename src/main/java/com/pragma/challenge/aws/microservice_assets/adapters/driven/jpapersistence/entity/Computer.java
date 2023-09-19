package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;

import javax.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Computer extends Technology {

    private String processor;

    private int ram;

    private String hardDrive;

    public Computer() {
    }

    public Computer(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String brand, String location, String detail, LocalDateTime warrantyExpirationDate, String warrantyDetail, String processor, int ram, String hardDrive) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, brand, location, detail, warrantyExpirationDate, warrantyDetail);
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }
}
