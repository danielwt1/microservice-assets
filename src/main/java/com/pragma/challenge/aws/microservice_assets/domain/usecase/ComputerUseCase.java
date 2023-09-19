package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.ComputerModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.ComputerApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.ComputerPersistencePort;

public class ComputerUseCase implements ComputerApiPort {

    private final ComputerPersistencePort computerPersistencePort;

    public ComputerUseCase(ComputerPersistencePort computerPersistencePort) {
        this.computerPersistencePort = computerPersistencePort;
    }

    @Override
    public void createComputer(ComputerModel toModel) {
        this.computerPersistencePort.createComputer(toModel);
    }
}
