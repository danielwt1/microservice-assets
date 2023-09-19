package com.pragma.challenge.aws.microservice_assets.domain.ports.api;

import com.pragma.challenge.aws.microservice_assets.domain.model.LicenseModel;

public interface LicenseApiPort {
    void createLicense(LicenseModel toModel);
}
