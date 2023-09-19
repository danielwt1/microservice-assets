package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.LicenseDTO;

public interface LicenseService {
    void createLicense(LicenseDTO request);
}
