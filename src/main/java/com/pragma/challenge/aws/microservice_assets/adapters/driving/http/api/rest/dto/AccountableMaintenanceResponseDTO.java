package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountableMaintenanceResponseDTO {
    private String email;
    private String name;
    private String empresaName;
}
