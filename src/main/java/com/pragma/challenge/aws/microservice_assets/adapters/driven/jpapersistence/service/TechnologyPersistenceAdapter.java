package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.TechnologyEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.TechnologyRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.TechnologyModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.TechnologyPersistencePort;

public class TechnologyPersistenceAdapter implements TechnologyPersistencePort {
    private final TechnologyRepository technologyJpaRepository;
    private final TechnologyEntityMapper technologyEntityMapper;

    public TechnologyPersistenceAdapter(TechnologyRepository technologyJpaRepository, TechnologyEntityMapper technologyEntityMapper) {
        this.technologyJpaRepository = technologyJpaRepository;
        this.technologyEntityMapper = technologyEntityMapper;
    }

    @Override
    public void createTechnology(TechnologyModel toModel) {
        this.technologyJpaRepository.save(this.technologyEntityMapper.toEntity(toModel));
    }
}
