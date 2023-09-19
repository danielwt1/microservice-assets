package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.MaintenanceModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenanceApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenancePersistencePort;

public class MaintenanceUseCase implements MaintenanceApiPort {
    private final MaintenancePersistencePort maintenancePersistencePort;

    public MaintenanceUseCase(MaintenancePersistencePort maintenancePersistencePort) {
        this.maintenancePersistencePort = maintenancePersistencePort;
    }

    @Override
    public void createMaintenance(MaintenanceModel maintenance) {
        this.maintenancePersistencePort.createMaintenance(maintenance);
    }
}
