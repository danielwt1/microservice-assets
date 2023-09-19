package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;
@Entity
@PrimaryKeyJoinColumn(name = "furniture_fixed_assetId")
public class Fixed extends Furniture{


    public Fixed() {
    }

    public Fixed(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String manufacturer, String location, int quantity, String detail) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, manufacturer, location, quantity, detail);
    }
}
