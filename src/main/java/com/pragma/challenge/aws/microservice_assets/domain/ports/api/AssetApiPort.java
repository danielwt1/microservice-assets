package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetsResponseDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.response.AssetsResponseModel;

import java.util.List;

public interface AssetApiPort {
    List<AssetsResponseModel> getAssets();
}
