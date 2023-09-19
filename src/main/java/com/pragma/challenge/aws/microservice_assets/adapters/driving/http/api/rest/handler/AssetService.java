package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;


import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetsResponseDTO;

import java.util.List;

public interface AssetService {
    List<AssetsResponseDTO> getAssets();
}
