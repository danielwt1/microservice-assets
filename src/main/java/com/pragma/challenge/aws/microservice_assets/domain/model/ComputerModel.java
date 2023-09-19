package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class ComputerModel extends TechnologyModel {

    private Long computerId;

    private String processor;

    private int ram;

    private String hardDrive;

    public ComputerModel() {
    }

    public ComputerModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long idTechNology, String brand, String location, String detail, LocalDateTime warrantyExpirationDate, String warrantyDetail, Long computerId, String processor, int ram, String hardDrive) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, idTechNology, brand, location, detail, warrantyExpirationDate, warrantyDetail);
        this.computerId = computerId;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Long getComputerId() {
        return computerId;
    }

    public void setComputerId(Long computerId) {
        this.computerId = computerId;
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
