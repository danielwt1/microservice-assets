package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.TechnologyDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.TechnologyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/assets/technology/")
public class TechnologyController {

    private final TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
    @PostMapping
    public ResponseEntity<String> createTechnology(@RequestBody @Valid TechnologyDTO technologyDTO) {
        this.technologyService.createTechnology(technologyDTO);
        return new ResponseEntity<>("Technology created", HttpStatus.CREATED);
    }
}
