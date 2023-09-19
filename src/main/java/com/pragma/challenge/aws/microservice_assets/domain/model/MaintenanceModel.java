package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class MaintenanceModel extends FurnitureModel {
    private Long maintenanceId;
    private Long typeId;
    private Long accountableId;

    public MaintenanceModel() {
    }

    public MaintenanceModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long furnitureId, String manufacturer, String location, int quantity, String detail, Long maintenanceId, Long typeId, Long accountableId1) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, furnitureId, manufacturer, location, quantity, detail);
        this.maintenanceId = maintenanceId;
        this.typeId = typeId;
        this.accountableId = accountableId1;
    }

    public Long getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(Long maintenanceId) {
        this.maintenanceId = maintenanceId;
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
