package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.AbstractModel;

public interface AbstractPersistencePort {
    void createAbstract(AbstractModel abstractModel);
}
