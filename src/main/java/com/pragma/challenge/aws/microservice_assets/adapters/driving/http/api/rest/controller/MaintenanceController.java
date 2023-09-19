package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.MaintenanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/furniture/maintenance")
public class MaintenanceController {
    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @PostMapping()
    public ResponseEntity<String> createMaintenance(@RequestBody @Valid MaintenanceDTO maintenance){
        this.maintenanceService.createMaintenance(maintenance);
        return new ResponseEntity<>("Maintenance created", HttpStatus.CREATED);
    }

}
