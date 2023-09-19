package com.pragma.challenge.aws.microservice_assets.domain.usecase;

import com.pragma.challenge.aws.microservice_assets.domain.model.LicenseModel;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.LicenseApiPort;
import com.pragma.challenge.aws.microservice_assets.domain.ports.spi.LicensePersistencePort;

public class LicenseUseCase implements LicenseApiPort {

    private final LicensePersistencePort licencePersistencePort;

    public LicenseUseCase(LicensePersistencePort licencePersistencePort) {
        this.licencePersistencePort = licencePersistencePort;
    }

    @Override
    public void createLicense(LicenseModel toModel) {
        this.licencePersistencePort.createLicense(toModel);
    }
}
