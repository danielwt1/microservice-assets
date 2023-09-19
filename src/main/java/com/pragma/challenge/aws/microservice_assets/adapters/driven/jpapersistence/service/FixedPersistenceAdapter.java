package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.FixedEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.FixedRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.FixedModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.FixedPersistencePort;

public class FixedPersistenceAdapter implements FixedPersistencePort {
    private final FixedEntityMapper fixedEntityMapper;
    private final FixedRepository fixedJpaRepository;

    public FixedPersistenceAdapter(FixedEntityMapper fixedEntityMapper, FixedRepository fixedJpaRepository) {
        this.fixedEntityMapper = fixedEntityMapper;
        this.fixedJpaRepository = fixedJpaRepository;
    }

    @Override
    public void createFixed(FixedModel toModel) {
        this.fixedJpaRepository.save(this.fixedEntityMapper.toEntity(toModel));
    }
}
