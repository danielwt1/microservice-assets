package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.response.AssetsResponseModel;

import java.util.List;

public interface AssetPersistencePort {
    List<AssetsResponseModel> getAssets();
}
