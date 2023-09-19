package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.service;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper.LicenseEntityMapper;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.repository.LicenseRepository;
import com.pragma.challenge.aws.microservice_assets.domain.model.LicenseModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.LicensePersistencePort;

public class LicensePersistenceAdapter implements LicensePersistencePort {
    private final LicenseRepository licenseRepository;
    private final LicenseEntityMapper licenseEntityMapper;

    public LicensePersistenceAdapter(LicenseRepository licenseRepository, LicenseEntityMapper licenseEntityMapper) {
        this.licenseRepository = licenseRepository;
        this.licenseEntityMapper = licenseEntityMapper;
    }

    @Override
    public void createLicense(LicenseModel toModel) {
        this.licenseRepository.save(this.licenseEntityMapper.toEntity(toModel));
    }
}
