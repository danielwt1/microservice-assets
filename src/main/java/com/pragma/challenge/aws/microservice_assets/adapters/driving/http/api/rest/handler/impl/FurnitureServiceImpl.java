package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FurnitureDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.FurnitureService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.FurnitureModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.FurnitureApiPort;
import org.springframework.stereotype.Service;

@Service
public class FurnitureServiceImpl implements FurnitureService {
    private final FurnitureApiPort furnitureApiPort;
    private final FurnitureModelMapper furnitureModelMapper;

    public FurnitureServiceImpl(FurnitureApiPort furnitureApiPort, FurnitureModelMapper furnitureModelMapper) {
        this.furnitureApiPort = furnitureApiPort;
        this.furnitureModelMapper = furnitureModelMapper;
    }

    @Override
    public void addMaintenanceToFurniture(Long furnitureId, MaintenanceDTO maintenanceDTO) {
        this.furnitureApiPort.createFurniture(this.furnitureModelMapper.toModel(maintenanceDTO));
    }

    @Override
    public void createFurniture(FurnitureDTO request) {
        this.furnitureApiPort.createFurniture(this.furnitureModelMapper.toModel(request));
    }
}
