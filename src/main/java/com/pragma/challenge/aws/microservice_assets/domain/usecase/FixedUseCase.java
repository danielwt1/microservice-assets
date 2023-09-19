package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.FixedModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.FixedApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.FixedPersistencePort;

public class FixedUseCase implements FixedApiPort {

    private final FixedPersistencePort persistencePort;

    public FixedUseCase(FixedPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public void createFixed(FixedModel toModel) {
        this.persistencePort.createFixed(toModel);
    }
}
