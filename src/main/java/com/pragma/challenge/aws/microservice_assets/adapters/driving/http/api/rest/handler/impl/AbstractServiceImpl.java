package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AbstractDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.AbstractService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.AbstractModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AbstractApiPort;
import org.springframework.stereotype.Service;

@Service
public class AbstractServiceImpl implements AbstractService {

    private final AbstractApiPort abstractApiPort;
    private final AbstractModelMapper abstractModelMapper;

    public AbstractServiceImpl(AbstractApiPort abstractApiPort, AbstractModelMapper abstractModelMapper) {
        this.abstractApiPort = abstractApiPort;
        this.abstractModelMapper = abstractModelMapper;
    }
    @Override
    public void createAbstract(AbstractDTO request) {
            this.abstractApiPort.createAbstract(this.abstractModelMapper.toModel(request));
    }
}
