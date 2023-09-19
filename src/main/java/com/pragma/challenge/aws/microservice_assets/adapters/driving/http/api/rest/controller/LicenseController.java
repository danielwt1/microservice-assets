package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.LicenseDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.LicenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/license/")
public class LicenseController {
    private final LicenseService licenseService;

    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }
    @PostMapping()
    public ResponseEntity<String> createLicense(@RequestBody @Valid LicenseDTO request) {
        this.licenseService.createLicense(request);
        return new ResponseEntity<>("License created", HttpStatus.CREATED);
    }
}
