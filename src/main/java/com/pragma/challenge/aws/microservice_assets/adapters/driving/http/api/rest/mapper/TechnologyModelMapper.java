package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.TechnologyDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.TechnologyModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TechnologyModelMapper {
    TechnologyModel toModel(TechnologyDTO technologyDTO);
    TechnologyDTO toDTO(TechnologyModel technologyModel);
}
