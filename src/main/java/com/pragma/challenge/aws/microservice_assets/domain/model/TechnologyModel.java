package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class TechnologyModel extends AssetModel {

    private Long idTechNology;
    private String brand;

    private String location;

    private String detail;

    private LocalDateTime warrantyExpirationDate;

    private String warrantyDetail;

    public TechnologyModel() {
    }

    public TechnologyModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long idTechNology, String brand, String location, String detail, LocalDateTime warrantyExpirationDate, String warrantyDetail) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status);
        this.idTechNology = idTechNology;
        this.brand = brand;
        this.location = location;
        this.detail = detail;
        this.warrantyExpirationDate = warrantyExpirationDate;
        this.warrantyDetail = warrantyDetail;
    }

    public Long getIdTechNology() {
        return idTechNology;
    }

    public void setIdTechNology(Long idTechNology) {
        this.idTechNology = idTechNology;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public LocalDateTime getWarrantyExpirationDate() {
        return warrantyExpirationDate;
    }

    public void setWarrantyExpirationDate(LocalDateTime warrantyExpirationDate) {
        this.warrantyExpirationDate = warrantyExpirationDate;
    }

    public String getWarrantyDetail() {
        return warrantyDetail;
    }

    public void setWarrantyDetail(String warrantyDetail) {
        this.warrantyDetail = warrantyDetail;
    }
}

