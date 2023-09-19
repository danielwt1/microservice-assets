package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.response.AssetsResponseModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AssetApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AssetPersistencePort;

import java.util.List;

public class AssetUseCase implements AssetApiPort {

    private final AssetPersistencePort assetPersistencePort;

    public AssetUseCase(AssetPersistencePort assetPersistencePort) {
        this.assetPersistencePort = assetPersistencePort;
    }

    @Override
    public List<AssetsResponseModel> getAssets() {
        return this.assetPersistencePort.getAssets();
    }
}
