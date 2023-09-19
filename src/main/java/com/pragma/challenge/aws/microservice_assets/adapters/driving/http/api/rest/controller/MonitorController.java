package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MonitorDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.MonitorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/assets/technology/monitor/")
public class MonitorController {
    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @PostMapping()
    public ResponseEntity<String> createMonitor(@RequestBody @Valid MonitorDTO request) {
        this.monitorService.createMonitor(request);
        return new ResponseEntity<>("Monitor created", HttpStatus.CREATED);
    }
}
