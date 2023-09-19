package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;

import javax.persistence.Entity;

import java.time.LocalDateTime;
@Entity
public class Maintenance extends Furniture{

    private Long typeId;
    private Long accountableId;

    public Maintenance() {
    }

    public Maintenance(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String manufacturer, String location, int quantity, String detail, Long typeId, Long accountableId1) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, manufacturer, location, quantity, detail);
        this.typeId = typeId;
        this.accountableId = accountableId1;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getAccountableId() {
        return accountableId;
    }

    public void setAccountableId(Long accountableId) {
        this.accountableId = accountableId;
    }
}
