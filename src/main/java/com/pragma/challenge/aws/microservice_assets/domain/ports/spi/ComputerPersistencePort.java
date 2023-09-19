package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.ComputerModel;

public interface ComputerPersistencePort {
    void createComputer(ComputerModel toModel);
}
