package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.TechnologyModel;

public interface TechnologyPersistencePort {
    void createTechnology(TechnologyModel toModel);
}
