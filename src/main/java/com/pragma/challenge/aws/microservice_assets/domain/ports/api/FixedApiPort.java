package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.domain.model.FixedModel;

public interface FixedApiPort {
    void createFixed(FixedModel toModel);
}
