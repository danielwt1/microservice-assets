package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.FurnitureModel;

public interface FurniturePersistencePort {
    void createFurniture(FurnitureModel toModel);
}
