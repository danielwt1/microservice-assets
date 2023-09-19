package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.AbstractModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AbstractApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AbstractPersistencePort;

public class AbstractUseCase implements AbstractApiPort {
    private final AbstractPersistencePort persistencePort;

    public AbstractUseCase(AbstractPersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public void createAbstract(AbstractModel abstractModel) {
        this.persistencePort.createAbstract(abstractModel);
    }
}
