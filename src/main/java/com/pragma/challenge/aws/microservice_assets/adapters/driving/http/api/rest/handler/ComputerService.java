package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.ComputerDTO;

public interface ComputerService {
    void createComputer(ComputerDTO request);
}
