package com.pragma.challenge.aws.microservice_assets.domain.model.response;

import java.time.LocalDate;

public class AssetsResponseModel {
    private Long assetId;
    private String invoiceNumber;
    private LocalDate purchaseDate;
    private String description;
    private String status;
    private Long accountableId;
    private Long accountableTypeId;
    private String url;
    private String hardDrive;
    private String processor;
    private String ram;
    private Long idFK;
    private String furnDetail;
    private String furnLocation;
    private String manufacturer;
    private Long quantity;
    private LocalDate expirationDate;
    private String licenseState;
    private String provider;
    private Long accountableMaintenanceId;
    private Long typeId;
    private Long inches;
    private String brand;
    private String techDetail;
    private String techLocation;
    private String warrantyDetail;
    private LocalDate warrantyExpirationDate;

    public AssetsResponseModel() {
    }

    public AssetsResponseModel(Long assetId, String invoiceNumber, LocalDate purchaseDate, String description, String status, Long accountableId, Long accountableTypeId, String url, String hardDrive, String processor, String ram, Long idFK, String furnDetail, String furnLocation, String manufacturer, Long quantity, LocalDate expirationDate, String licenseState, String provider, Long accountableMaintenanceId, Long typeId, Long inches, String brand, String techDetail, String techLocation, String warrantyDetail, LocalDate warrantyExpirationDate) {
        this.assetId = assetId;
        this.invoiceNumber = invoiceNumber;
        this.purchaseDate = purchaseDate;
        this.description = description;
        this.status = status;
        this.accountableId = accountableId;
        this.accountableTypeId = accountableTypeId;
        this.url = url;
        this.hardDrive = hardDrive;
        this.processor = processor;
        this.ram = ram;
        this.idFK = idFK;
        this.furnDetail = furnDetail;
        this.furnLocation = furnLocation;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.licenseState = licenseState;
        this.provider = provider;
        this.accountableMaintenanceId = accountableMaintenanceId;
        this.typeId = typeId;
        this.inches = inches;
        this.brand = brand;
        this.techDetail = techDetail;
        this.techLocation = techLocation;
        this.warrantyDetail = warrantyDetail;
        this.warrantyExpirationDate = warrantyExpirationDate;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Long getIdFK() {
        return idFK;
    }

    public void setIdFK(Long idFK) {
        this.idFK = idFK;
    }

    public String getFurnDetail() {
        return furnDetail;
    }

    public void setFurnDetail(String furnDetail) {
        this.furnDetail = furnDetail;
    }

    public String getFurnLocation() {
        return furnLocation;
    }

    public void setFurnLocation(String furnLocation) {
        this.furnLocation = furnLocation;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Long getAccountableMaintenanceId() {
        return accountableMaintenanceId;
    }

    public void setAccountableMaintenanceId(Long accountableMaintenanceId) {
        this.accountableMaintenanceId = accountableMaintenanceId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getInches() {
        return inches;
    }

    public void setInches(Long inches) {
        this.inches = inches;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTechDetail() {
        return techDetail;
    }

    public void setTechDetail(String techDetail) {
        this.techDetail = techDetail;
    }

    public String getTechLocation() {
        return techLocation;
    }

    public void setTechLocation(String techLocation) {
        this.techLocation = techLocation;
    }

    public String getWarrantyDetail() {
        return warrantyDetail;
    }

    public void setWarrantyDetail(String warrantyDetail) {
        this.warrantyDetail = warrantyDetail;
    }

    public LocalDate getWarrantyExpirationDate() {
        return warrantyExpirationDate;
    }

    public void setWarrantyExpirationDate(LocalDate warrantyExpirationDate) {
        this.warrantyExpirationDate = warrantyExpirationDate;
    }
}
