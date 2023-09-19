package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import java.time.LocalDateTime;
@Entity
@PrimaryKeyJoinColumn(name = "furniture_maintenance_asseId")

public class Maintenance extends Furniture{

    private Long typeId;
    private Long accountableMaintenanceId;

    public Maintenance() {
    }

    public Maintenance(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String manufacturer, String location, int quantity, String detail, Long typeId, Long accountableMaintenanceId) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, manufacturer, location, quantity, detail);
        this.typeId = typeId;
        this.accountableMaintenanceId = accountableMaintenanceId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getAccountableMaintenanceId() {
        return accountableMaintenanceId;
    }

    public void setAccountableMaintenanceId(Long accountableMaintenanceId) {
        this.accountableMaintenanceId = accountableMaintenanceId;
    }
}
