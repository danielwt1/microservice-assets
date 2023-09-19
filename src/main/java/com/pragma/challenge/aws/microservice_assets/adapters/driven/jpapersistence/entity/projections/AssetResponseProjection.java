package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.projections;


import java.time.LocalDate;
public interface AssetResponseProjection {
    Long getAssetId();
    String getInvoiceNumber();
    LocalDate getPurchaseDate();
    String getDescription();
    String getStatus();
    Long getAccountableId();
    Long getAccountableTypeId();
    String getUrl();
    String getHardDrive();
    String getProcessor();
    String getRam();
    Long getIdFK();
    String getFurnDetail();
    String getFurnLocation();
    String getManufacturer();
    Long getQuantity();
    LocalDate getExpirationDate();
    String getLicenseState();
    String getProvider();
    Long getAccountableMaintenanceId();
    Long getTypeId();
    Long getInches();
    String getBrand();
    String getTechDetail();
    String getTechLocation();
    String getWarrantyDetail();
    LocalDate getWarrantyExpirationDate();
}
