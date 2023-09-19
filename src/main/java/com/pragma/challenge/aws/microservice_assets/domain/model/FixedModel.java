package com.pragma.challenge.aws.microservice_assets.domain.model;

import java.time.LocalDateTime;

public class FixedModel extends FurnitureModel {

    public FixedModel() {
    }

        public FixedModel(Long assetid, Long accountableId, Long accountableTypeId, LocalDateTime purchaseDate, String invoiceNumber, String description, String status, Long furnitureId, String manufacturer, String location, int quantity, String detail, Long fixedId) {
        super(assetid, accountableId, accountableTypeId, purchaseDate, invoiceNumber, description, status, furnitureId, manufacturer, location, quantity, detail);
    }

}
