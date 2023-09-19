package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.ComputerDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.ComputerService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.ComputerModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.ComputerApiPort;
import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImpl implements ComputerService {
    private final ComputerApiPort computerApiPort;
    private final ComputerModelMapper computerModelMapper;

    public ComputerServiceImpl(ComputerApiPort computerApiPort, ComputerModelMapper computerModelMapper) {
        this.computerApiPort = computerApiPort;
        this.computerModelMapper = computerModelMapper;
    }

    @Override
    public void createComputer(ComputerDTO request) {
        this.computerApiPort.createComputer(this.computerModelMapper.toModel(request));

    }
}
