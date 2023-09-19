package com.pragma.challenge.aws.microservice_assets.domain.ports.spi;

import com.pragma.challenge.aws.microservice_assets.domain.model.LicenseModel;

public interface LicensePersistencePort {
    void createLicense(LicenseModel toModel);
}
