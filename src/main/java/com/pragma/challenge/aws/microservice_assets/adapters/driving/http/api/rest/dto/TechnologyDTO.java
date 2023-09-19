package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyDTO extends AssetDTO{
    private String brand;

    private String location;

    private String detail;

    private LocalDateTime warrantyExpirationDate;

    private String warrantyDetail;
}
