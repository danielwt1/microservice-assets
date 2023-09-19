package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity;


import javax.persistence.Entity;
import java.time.LocalDateTime;
@Entity
public class Fixed extends Furniture{


    public Fixed() {
    }

    public Fixed(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, String manufacturer, String location, int quantity, String detail) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, manufacturer, location, quantity, detail);
    }
}
