package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Monitor;
import com.pragma.challenge.aws.microservice_assets.domain.model.MonitorModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MonitorEntityMapper {
    Monitor  toEntity(MonitorModel monitorModel);
    MonitorModel toModel(Monitor monitorEntity);
    List<MonitorModel> toModelList(List<Monitor> monitorEntityList);
    List<Monitor> toEntityList(List<MonitorModel> monitorModelList);
}
