package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;

public interface MonitorPersistencePort {
    MonitorModel addMonitor(MonitorModel monitorModel);
}
