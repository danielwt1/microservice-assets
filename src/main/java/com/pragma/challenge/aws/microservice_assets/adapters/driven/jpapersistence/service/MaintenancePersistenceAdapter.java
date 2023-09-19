package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.MaintenanceEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.MaintenanceRepository;

import com.pragma.challenge.aws.microservice_assets.domain.model.MaintenanceModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenancePersistencePort;

public class MaintenancePersistenceAdapter implements MaintenancePersistencePort {

    private final MaintenanceRepository maintenanceRepository;
    private final MaintenanceEntityMapper maintenanceEntityMapper;

    public MaintenancePersistenceAdapter(MaintenanceRepository maintenanceRepository, MaintenanceEntityMapper maintenanceEntityMapper) {
        this.maintenanceRepository = maintenanceRepository;
        this.maintenanceEntityMapper = maintenanceEntityMapper;
    }



    @Override
    public void createMaintenance(MaintenanceModel maintenance) {
        this.maintenanceRepository.save(this.maintenanceEntityMapper.toEntity(maintenance));
    }
}
