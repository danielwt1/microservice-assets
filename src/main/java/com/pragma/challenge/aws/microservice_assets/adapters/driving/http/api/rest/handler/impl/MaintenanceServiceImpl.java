package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.MaintenanceService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.MaintenanceModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenanceApiPort;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {
    private final MaintenanceApiPort maintenanceApiPort;
    private final MaintenanceModelMapper maintenanceModelMapper;

    public MaintenanceServiceImpl(MaintenanceApiPort maintenanceApiPort, MaintenanceModelMapper maintenanceModelMapper) {
        this.maintenanceApiPort = maintenanceApiPort;
        this.maintenanceModelMapper = maintenanceModelMapper;
    }

    @Override
    public void createMaintenance(MaintenanceDTO maintenanceDTO) {
        this.maintenanceApiPort.createMaintenance(this.maintenanceModelMapper.toModel(maintenanceDTO));
    }
}
