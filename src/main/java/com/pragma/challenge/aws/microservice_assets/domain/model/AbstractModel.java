package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class AbstractModel extends AssetModel{
    private String url;

    public AbstractModel() {
    }

    public AbstractModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long abstractId, String url) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
