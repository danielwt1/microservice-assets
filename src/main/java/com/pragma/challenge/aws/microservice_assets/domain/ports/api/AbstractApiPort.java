package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.domain.model.AbstractModel;

public interface AbstractApiPort {
    void createAbstract(AbstractModel abstractModel);
}
