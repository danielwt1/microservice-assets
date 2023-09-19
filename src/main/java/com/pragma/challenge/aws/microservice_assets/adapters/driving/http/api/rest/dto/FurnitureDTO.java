package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FurnitureDTO extends AssetDTO {
    private Long furnitureId;
    private String manufacturer;

    private String location;

    private int quantity;

    private String detail;
}
