package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class LicenseModel extends AbstractModel{
    private Long licenseId;
    private String provider;
    private LocalDateTime expirationDate;
    private String licenseState;

    public LicenseModel() {
    }

    public LicenseModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long abstractId, String url, Long licenseId, String provider, LocalDateTime expirationDate, String licenseState) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, abstractId, url);
        this.licenseId = licenseId;
        this.provider = provider;
        this.expirationDate = expirationDate;
        this.licenseState = licenseState;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
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
