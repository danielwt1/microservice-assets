package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;

public interface MaintenanceService {
    void createMaintenance(MaintenanceDTO maintenanceDTO);
}
