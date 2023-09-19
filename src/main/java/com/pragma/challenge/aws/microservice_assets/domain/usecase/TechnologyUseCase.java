package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.TechnologyModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.TechnologyApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.TechnologyPersistencePort;

public class TechnologyUseCase implements TechnologyApiPort {
    private final TechnologyPersistencePort technologyPersistencePort;

    public TechnologyUseCase(TechnologyPersistencePort technologyPersistencePort) {
        this.technologyPersistencePort = technologyPersistencePort;
    }

    @Override
    public void createTechnology(TechnologyModel toModel) {
        this.technologyPersistencePort.createTechnology(toModel);
    }
}
