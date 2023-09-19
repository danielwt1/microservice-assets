package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.AbstractEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.AbstractRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.AbstractModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.AbstractPersistencePort;

public class AbstractPersistenceAdapter implements AbstractPersistencePort {

    private final AbstractRepository abstractRepository;
    private final AbstractEntityMapper abstractEntityMapper;

    public AbstractPersistenceAdapter(AbstractRepository abstractRepository, AbstractEntityMapper abstractEntityMapper) {
        this.abstractRepository = abstractRepository;
        this.abstractEntityMapper = abstractEntityMapper;
    }

    @Override
    public void createAbstract(AbstractModel abstractModel) {
        this.abstractRepository.save(this.abstractEntityMapper.toEntity(abstractModel));
    }
}
