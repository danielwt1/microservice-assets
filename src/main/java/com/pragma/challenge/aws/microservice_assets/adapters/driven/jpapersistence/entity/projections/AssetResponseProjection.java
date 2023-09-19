package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.projections;


import java.time.LocalDate;
public interface AssetResponseProjection {
    Long getAssetId();
    Long getAccountableId();
    Long getAccountableTypeId();
    String getDescription();
    String getInvoiceNumber();
    LocalDate getPurchaseDate();
    String getStatus();
    String getUrl();
    String getHardDrive();
    String getProcessor();
    String getRam();
    String getDetail();
    String getLocation();
    String getManufacturer();
    Integer getQuantity();
    LocalDate getExpirationDate();
    String getLicenseState();
    String getProvider();
    Long getTypeId();
    Integer getInches();
    String getBrand();
    String getWarrantyDetail();
    LocalDate getWarrantyExpirationDate();
}
