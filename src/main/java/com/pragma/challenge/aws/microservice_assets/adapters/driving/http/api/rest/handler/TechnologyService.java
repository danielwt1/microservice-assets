package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.TechnologyDTO;

public interface TechnologyService {
    void createTechnology(TechnologyDTO technologyDTO);
}
