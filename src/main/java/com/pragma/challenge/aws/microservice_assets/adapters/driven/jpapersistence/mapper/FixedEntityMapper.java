package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Fixed;
import com.pragma.challenge.aws.microservice_assets.domain.model.FixedModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FixedEntityMapper {
    FixedModel toModel(Fixed fixed);
        Fixed toEntity(FixedModel fixedModel);
}
