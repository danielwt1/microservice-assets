package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class MonitorModel extends TechnologyModel{
    private short inches;

    public MonitorModel() {
    }

    public MonitorModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long idTechNology, String brand, String location, String detail, LocalDateTime warrantyExpirationDate, String warrantyDetail, Long monitorId, short inches) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, idTechNology, brand, location, detail, warrantyExpirationDate, warrantyDetail);
        this.inches = inches;
    }



    public short getInches() {
        return inches;
    }

    public void setInches(short inches) {
        this.inches = inches;
    }
}
