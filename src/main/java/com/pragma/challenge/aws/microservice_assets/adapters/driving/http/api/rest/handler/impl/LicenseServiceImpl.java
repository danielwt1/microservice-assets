package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.LicenseDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.LicenseService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.LicenseModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.LicenseApiPort;
import org.springframework.stereotype.Service;

@Service
public class LicenseServiceImpl implements LicenseService {
    private final LicenseModelMapper licenseModelMapper;
    private final LicenseApiPort licenseApiPort;

    public LicenseServiceImpl(LicenseModelMapper licenseModelMapper, LicenseApiPort licenseApiPort) {
        this.licenseModelMapper = licenseModelMapper;
        this.licenseApiPort = licenseApiPort;
    }

    @Override
    public void createLicense(LicenseDTO request) {
        this.licenseApiPort.createLicense(this.licenseModelMapper.toModel(request));
    }
}
