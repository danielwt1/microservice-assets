package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;

import javax.persistence.Entity;


import java.time.LocalDateTime;
@Entity
public class License extends Abstract{

    private String provider;
    private LocalDateTime expirationDate;
    private String licenseState;

    public License() {
    }

    public License(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String url, String provider, LocalDateTime expirationDate, String licenseState) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, url);
        this.provider = provider;
        this.expirationDate = expirationDate;
        this.licenseState = licenseState;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }
}
