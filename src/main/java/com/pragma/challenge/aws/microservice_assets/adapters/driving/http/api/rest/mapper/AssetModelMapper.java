package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Asset;
import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AssetModelMapper {
}
