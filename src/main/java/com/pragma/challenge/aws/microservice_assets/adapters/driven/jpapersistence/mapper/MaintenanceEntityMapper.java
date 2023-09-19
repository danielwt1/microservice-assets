package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Maintenance;
import com.pragma.challenge.aws.microservice_assets.domain.model.MaintenanceModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MaintenanceEntityMapper {
    Maintenance  toEntity(MaintenanceModel  maintenanceModel);
    MaintenanceModel toModel(Maintenance  maintenanceEntity);
    List<MaintenanceModel> toModelList(List<Maintenance> maintenanceEntityList);
    List<Maintenance> toEntityList(List<MaintenanceModel> maintenanceModelList);
}
