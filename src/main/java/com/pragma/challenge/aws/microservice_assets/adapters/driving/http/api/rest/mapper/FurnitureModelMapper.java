package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FurnitureDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.FurnitureModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedSourcePolicy = ReportingPolicy.IGNORE,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FurnitureModelMapper {
    FurnitureModel toModel(FurnitureDTO furnitureDTO);
    FurnitureDTO toDTO(FurnitureModel furnitureModel);
}
