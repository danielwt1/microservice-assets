package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AssetDTO {
    private Long accountableId;
    private Long accountableTypeId;
    private LocalDateTime purchaseDate;
    private String invoiceNumber;
    private String description;
    private String status;


}
