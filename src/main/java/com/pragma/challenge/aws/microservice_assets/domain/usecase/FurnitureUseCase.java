package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.FurnitureModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.FurnitureApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.FurniturePersistencePort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MaintenancePersistencePort;

public class FurnitureUseCase implements FurnitureApiPort {

    private final FurniturePersistencePort furniturePersistencePort;

    public FurnitureUseCase(FurniturePersistencePort furniturePersistencePort) {
        this.furniturePersistencePort = furniturePersistencePort;
    }

    @Override
    public void createFurniture(FurnitureModel toModel) {
        this.furniturePersistencePort.createFurniture(toModel);
    }
}
