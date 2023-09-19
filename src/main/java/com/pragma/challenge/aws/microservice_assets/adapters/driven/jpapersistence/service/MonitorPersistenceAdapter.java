package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.MonitorEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.MonitorRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MonitorPersistencePort;

public class MonitorPersistenceAdapter implements MonitorPersistencePort {
    private final MonitorRepository monitorRepository;
    private final MonitorEntityMapper monitorEntityMapper;

    public MonitorPersistenceAdapter(MonitorRepository monitorRepository, MonitorEntityMapper monitorEntityMapper) {
        this.monitorRepository = monitorRepository;
        this.monitorEntityMapper = monitorEntityMapper;
    }

    @Override
    public MonitorModel addMonitor(MonitorModel monitorModel) {
        return this.monitorEntityMapper.toModel(this.monitorRepository.save(this.monitorEntityMapper.toEntity(monitorModel)));
    }
}
