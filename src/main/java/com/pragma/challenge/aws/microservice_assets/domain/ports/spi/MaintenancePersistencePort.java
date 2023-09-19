package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;


import com.pragma.challenge.aws.microservice_assets.domain.model.MaintenanceModel;

public interface MaintenancePersistencePort {
    void createMaintenance(MaintenanceModel maintenance);
}
