package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MonitorDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.MonitorService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.MonitorModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.MonitorApiPort;
import org.springframework.stereotype.Service;

@Service
public class MonitorServiceImpl implements MonitorService {
    private final MonitorApiPort monitorApiPort;
    private final MonitorModelMapper monitorModelMapper;

    public MonitorServiceImpl(MonitorApiPort monitorApiPort, MonitorModelMapper monitorModelMapper) {
        this.monitorApiPort = monitorApiPort;
        this.monitorModelMapper = monitorModelMapper;
    }

    @Override
    public void createMonitor(MonitorDTO monitor) {
        this.monitorApiPort.addMonitor(this.monitorModelMapper.toModel(monitor));
    }
}
