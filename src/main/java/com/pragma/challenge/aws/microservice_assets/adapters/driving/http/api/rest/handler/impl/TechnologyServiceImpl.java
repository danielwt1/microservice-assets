package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.TechnologyDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.TechnologyService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.TechnologyModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.TechnologyApiPort;
import org.springframework.stereotype.Service;

@Service
public class TechnologyServiceImpl implements TechnologyService {
    private final TechnologyApiPort technologyApiPort;
    private final TechnologyModelMapper technologyModelMapper;

    public TechnologyServiceImpl(TechnologyApiPort technologyApiPort, TechnologyModelMapper technologyModelMapper) {
        this.technologyApiPort = technologyApiPort;
        this.technologyModelMapper = technologyModelMapper;
    }

    @Override
    public void createTechnology(TechnologyDTO technologyDTO) {
        this.technologyApiPort.createTechnology(this.technologyModelMapper.toModel(technologyDTO));
    }
}
