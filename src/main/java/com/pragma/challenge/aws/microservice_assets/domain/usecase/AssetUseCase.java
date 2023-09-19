package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AssetApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AssetPersistencePort;

public class AssetUseCase implements AssetApiPort {

    private final AssetPersistencePort assetPersistencePort;

    public AssetUseCase(AssetPersistencePort assetPersistencePort) {
        this.assetPersistencePort = assetPersistencePort;
    }
}
