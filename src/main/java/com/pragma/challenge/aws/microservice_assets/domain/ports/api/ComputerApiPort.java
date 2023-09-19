package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.domain.model.ComputerModel;

public interface ComputerApiPort {
    void createComputer(ComputerModel toModel);
}
