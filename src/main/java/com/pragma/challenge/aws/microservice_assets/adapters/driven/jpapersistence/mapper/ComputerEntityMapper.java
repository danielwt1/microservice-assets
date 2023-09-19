package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Computer;
import com.pragma.challenge.aws.microservice_assets.domain.model.ComputerModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ComputerEntityMapper {
    Computer toEntity(ComputerModel computerModel);
    ComputerModel toModel(Computer computer);
    List<ComputerModel> toModelList(List<Computer> computerEntityList);
    List<Computer> toEntityList(List<ComputerModel> computerModelList);
}
