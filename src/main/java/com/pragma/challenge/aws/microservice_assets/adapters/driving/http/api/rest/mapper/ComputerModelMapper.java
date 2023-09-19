package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.ComputerDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.ComputerModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ComputerModelMapper {
    ComputerModel  toModel(ComputerDTO computerDTO);
    ComputerDTO toDTO(ComputerModel computerModel);
}
