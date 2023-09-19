package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FurnitureDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.FurnitureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/assets/furniture/")
public class FurnitureController {

    private final FurnitureService  furnitureService;

    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }
    @PostMapping()
    public ResponseEntity<String> createFurniture(@RequestBody @Valid FurnitureDTO request) {
        this.furnitureService.createFurniture(request);
        return new ResponseEntity<>("Furniture created", HttpStatus.CREATED);
    }

    @PostMapping("{idFurniture}")
    public ResponseEntity<String> addMaintenanceToFurniture(@PathVariable Long idFurniture, @RequestBody @Valid MaintenanceDTO request) {
        this.furnitureService.addMaintenanceToFurniture(idFurniture, request);
        return new ResponseEntity<>("Furniture created", HttpStatus.CREATED);
    }
}
