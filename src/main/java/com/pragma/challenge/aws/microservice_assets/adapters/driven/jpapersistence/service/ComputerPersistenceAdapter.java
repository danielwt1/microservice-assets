package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.ComputerEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.ComputerRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.ComputerModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.ComputerPersistencePort;

public class ComputerPersistenceAdapter implements ComputerPersistencePort {

    private final ComputerRepository computerRepository;
    private final ComputerEntityMapper computerEntityMapper;

    public ComputerPersistenceAdapter(ComputerRepository computerRepository, ComputerEntityMapper computerEntityMapper) {
        this.computerRepository = computerRepository;
        this.computerEntityMapper = computerEntityMapper;
    }

    @Override
    public void createComputer(ComputerModel toModel) {
        this.computerRepository.save(this.computerEntityMapper.toEntity(toModel));
    }
}
