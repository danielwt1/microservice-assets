package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.controller;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetsResponseDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.AssetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/assets/")
public class AssetController {
    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }
    @GetMapping()
    public ResponseEntity<List<AssetsResponseDTO>> getAssets() {
        List<AssetsResponseDTO> response = this.assetService.getAssets();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
