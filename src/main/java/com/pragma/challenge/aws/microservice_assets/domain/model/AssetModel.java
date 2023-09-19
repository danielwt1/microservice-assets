package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class AssetModel {
    private Long assetid;
    private Long accountableId;
    private Long accountableTypeId;
    private LocalDateTime purchaseDate;
    private String invoiceNumber;

    private String description;

    private String status;


    public AssetModel() {
    }

    public AssetModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status) {
        this.assetid = assetid;
        this.accountableId = accountableId;
        this.accountableTypeId = accountableTypeId;
        this.purchaseDate = purchaseDate;
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.status = status;
    }

    public Long getAssetid() {
        return assetid;
    }

    public Long getAccountableId() {
        return accountableId;
    }

    public void setAccountableId(Long accountableId) {
        this.accountableId = accountableId;
    }

    public Long getAccountableTypeId() {
        return accountableTypeId;
    }

    public void setAccountableTypeId(Long accountableTypeId) {
        this.accountableTypeId = accountableTypeId;
    }

    public void setAssetid(Long assetid) {
        this.assetid = assetid;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
