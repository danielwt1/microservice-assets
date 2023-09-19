package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;


import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Abstract extends Asset{

    private String url;

    public Abstract() {
    }

    public Abstract(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String url) {
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
