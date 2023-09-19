package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AbstractDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/assets/abstract")

public class AbstractController {
    private final AbstractService abstractService;

    public AbstractController(AbstractService abstractService) {
        this.abstractService = abstractService;
    }
    @PostMapping("")
    public ResponseEntity<String> createAbstract(@RequestBody @Valid AbstractDTO request) {
        this.abstractService.createAbstract(request);
        return new ResponseEntity<>("Abstract created", HttpStatus.CREATED);
    }
}
