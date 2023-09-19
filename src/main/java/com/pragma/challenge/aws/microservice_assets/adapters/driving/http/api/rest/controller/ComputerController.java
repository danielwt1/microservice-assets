package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.ComputerDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.ComputerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/assets/technology/computer/")
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }
    @PostMapping()
    public ResponseEntity<String> createComputer(@RequestBody @Valid ComputerDTO request) {
        this.computerService.createComputer(request);
        return new ResponseEntity<>("Computer created", HttpStatus.CREATED);
    }
}
