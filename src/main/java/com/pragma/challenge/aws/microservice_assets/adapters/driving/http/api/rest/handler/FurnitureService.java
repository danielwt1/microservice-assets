package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FurnitureDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;

public interface FurnitureService {
    void addMaintenanceToFurniture(Long furnitureId, MaintenanceDTO maintenanceDTO);

    void createFurniture(FurnitureDTO request);
}
