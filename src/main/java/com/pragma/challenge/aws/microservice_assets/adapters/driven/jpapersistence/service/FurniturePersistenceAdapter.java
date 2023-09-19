package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.FurnitureEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.FurnitureRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.FurnitureModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.FurniturePersistencePort;

public class FurniturePersistenceAdapter implements FurniturePersistencePort {
    private final FurnitureRepository furnitureRepository;
    private final FurnitureEntityMapper furnitureEntityMapper;

    public FurniturePersistenceAdapter(FurnitureRepository furnitureRepository, FurnitureEntityMapper furnitureEntityMapper) {
        this.furnitureRepository = furnitureRepository;
        this.furnitureEntityMapper = furnitureEntityMapper;
    }

    @Override
    public void createFurniture(FurnitureModel toModel) {
        this.furnitureRepository.save(this.furnitureEntityMapper.toEntity(toModel));
    }
}
