package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.AssetEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.AssetRepository;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AssetPersistencePort;

public class AssetPersistenceAdapter implements AssetPersistencePort {
    private final AssetRepository  assetRepository;
    private final AssetEntityMapper assetEntityMapper;

    public AssetPersistenceAdapter(AssetRepository assetRepository, AssetEntityMapper assetEntityMapper) {
        this.assetRepository = assetRepository;
        this.assetEntityMapper = assetEntityMapper;
    }
}
