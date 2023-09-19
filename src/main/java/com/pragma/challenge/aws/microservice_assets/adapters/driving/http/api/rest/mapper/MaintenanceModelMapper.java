package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MaintenanceDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.MaintenanceModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MaintenanceModelMapper {
    MaintenanceDTO toDTO(MaintenanceModel maintenanceModel);
    MaintenanceModel toModel(MaintenanceDTO maintenanceDTO);
}
