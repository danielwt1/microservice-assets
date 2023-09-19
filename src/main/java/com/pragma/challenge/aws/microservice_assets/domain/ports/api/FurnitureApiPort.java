package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.domain.model.FurnitureModel;

public interface FurnitureApiPort {
    void createFurniture(FurnitureModel toModel);
}
