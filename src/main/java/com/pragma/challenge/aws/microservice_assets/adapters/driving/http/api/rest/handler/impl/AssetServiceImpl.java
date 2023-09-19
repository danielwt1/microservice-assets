package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.impl;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetsResponseDTO;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.handler.AssetService;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper.AssetModelMapper;
import com.pragma.challenge.aws.microservice_assets.domain.ports.api.AssetApiPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {
    private final AssetApiPort assetApiPort;
    private final AssetModelMapper assetModelMapper;

    public AssetServiceImpl(AssetApiPort assetApiPort, AssetModelMapper assetModelMapper) {
        this.assetApiPort = assetApiPort;
        this.assetModelMapper = assetModelMapper;
    }

    @Override
    public List<AssetsResponseDTO> getAssets() {
        return this.assetModelMapper.toListDTO(this.assetApiPort.getAssets());
    }
}
