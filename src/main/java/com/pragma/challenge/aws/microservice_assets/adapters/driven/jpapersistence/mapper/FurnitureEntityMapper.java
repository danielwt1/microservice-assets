package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Furniture;
import com.pragma.challenge.aws.microservice_assets.domain.model.FurnitureModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedSourcePolicy = ReportingPolicy.IGNORE,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FurnitureEntityMapper {
    FurnitureModel toModel(Furniture furniture);
    Furniture toEntity(FurnitureModel furnitureModel);
}
