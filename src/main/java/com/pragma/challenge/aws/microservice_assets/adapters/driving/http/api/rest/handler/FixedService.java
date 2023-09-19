package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FixedDTO;

public interface FixedService {
    void createFixed(FixedDTO request);
}
