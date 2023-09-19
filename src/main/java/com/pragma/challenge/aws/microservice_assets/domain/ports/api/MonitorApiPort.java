package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;

public interface MonitorApiPort {

    MonitorModel addMonitor(MonitorModel monitorModel);

}
