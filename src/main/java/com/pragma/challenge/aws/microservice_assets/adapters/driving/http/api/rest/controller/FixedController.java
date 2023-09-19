package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FixedDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.FixedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/fixed/")
public class FixedController {
    private final FixedService fixedService;

    public FixedController(FixedService fixedService) {
        this.fixedService = fixedService;
    }
    @PostMapping()
    public ResponseEntity<String> createFixed(@RequestBody @Valid FixedDTO request) {
        this.fixedService.createFixed(request);
        return new ResponseEntity<>("Fixed created", HttpStatus.CREATED);
    }
}
