package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class FurnitureModel extends AssetModel {

    private Long furnitureId;
    private String manufacturer;

    private String location;

    private int quantity;

    private String detail;

    public FurnitureModel() {
    }

    public FurnitureModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long furnitureId, String manufacturer, String location, int quantity, String detail) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status);
        this.furnitureId = furnitureId;
        this.manufacturer = manufacturer;
        this.location = location;
        this.quantity = quantity;
        this.detail = detail;
    }

    public Long getFurnitureId() {
        return furnitureId;
    }

    public void setFurnitureId(Long furnitureId) {
        this.furnitureId = furnitureId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
