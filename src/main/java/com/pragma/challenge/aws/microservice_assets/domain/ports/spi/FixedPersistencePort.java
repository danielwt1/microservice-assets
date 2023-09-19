package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.FixedModel;

public interface FixedPersistencePort {
    void createFixed(FixedModel toModel);
}
