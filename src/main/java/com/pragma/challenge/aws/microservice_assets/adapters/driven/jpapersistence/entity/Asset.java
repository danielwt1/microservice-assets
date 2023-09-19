package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assetid;
    private Long accountableId;
    private Long accountableTypeId;
    private LocalDateTime purchaseDate;
    private String invoiceNumber;

    private String description;

    private String status;

    public Asset() {
    }

    public Asset(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status) {
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

    public void setAssetid(Long assetid) {
        this.assetid = assetid;
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
