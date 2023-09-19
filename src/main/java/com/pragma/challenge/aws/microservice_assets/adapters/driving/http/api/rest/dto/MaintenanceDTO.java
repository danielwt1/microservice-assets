package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MaintenanceDTO extends FurnitureDTO{
    private Long maintenanceId;
    private Long typeId;
    private Long accountableId;
}
