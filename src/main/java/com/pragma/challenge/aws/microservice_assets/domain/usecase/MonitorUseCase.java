package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.MonitorApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.MonitorPersistencePort;

public class MonitorUseCase implements MonitorApiPort {

    private final MonitorPersistencePort monitorPersistencePort;

    public MonitorUseCase(MonitorPersistencePort monitorPersistencePort) {
        this.monitorPersistencePort = monitorPersistencePort;
    }

    @Override
    public MonitorModel addMonitor(MonitorModel monitorModel) {
        return this.monitorPersistencePort.addMonitor(monitorModel);
    }
}
