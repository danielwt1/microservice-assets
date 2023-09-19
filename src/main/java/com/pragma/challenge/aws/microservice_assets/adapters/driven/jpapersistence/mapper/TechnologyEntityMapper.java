package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Technology;
import com.pragma.challenge.aws.microservice_assets.domain.model.TechnologyModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TechnologyEntityMapper {
    Technology toEntity(TechnologyModel technologyModel);
    TechnologyModel toModel(Technology technology);
}
