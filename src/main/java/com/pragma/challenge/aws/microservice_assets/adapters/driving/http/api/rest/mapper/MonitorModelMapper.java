package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.MonitorDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MonitorModelMapper {

    MonitorModel toModel(MonitorDTO monitorDTO);
    MonitorDTO toDTO(MonitorModel monitorModel);

}
