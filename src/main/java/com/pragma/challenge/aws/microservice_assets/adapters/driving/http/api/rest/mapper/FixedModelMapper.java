package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.FixedDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.FixedModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface FixedModelMapper {
    FixedModel toModel(FixedDTO fixedDTO);
    FixedDTO toDTO(FixedModel fixedModel);
}
