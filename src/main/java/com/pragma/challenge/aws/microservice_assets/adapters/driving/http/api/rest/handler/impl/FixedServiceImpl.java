package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FixedDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.FixedService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.FixedModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.FixedApiPort;
import org.springframework.stereotype.Service;

@Service
public class FixedServiceImpl implements FixedService {
    private final FixedApiPort fixedApiPort;
    private final FixedModelMapper fixedModelMapper;

    public FixedServiceImpl(FixedApiPort fixedApiPort, FixedModelMapper fixedModelMapper) {
        this.fixedApiPort = fixedApiPort;
        this.fixedModelMapper = fixedModelMapper;
    }

    @Override
    public void createFixed(FixedDTO request) {
        this.fixedApiPort.createFixed(this.fixedModelMapper.toModel(request));

    }
}
