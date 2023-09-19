package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetsResponseDTO {
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
}
