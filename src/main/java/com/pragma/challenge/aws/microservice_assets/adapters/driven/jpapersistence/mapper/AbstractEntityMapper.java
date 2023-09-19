package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Abstract;
import com.pragma.challenge.aws.microservice_assets.domain.model.AbstractModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper( componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE,unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface AbstractEntityMapper {
    Abstract toEntity(AbstractModel abstractModel);
    AbstractModel toModel(Abstract abstractEntity);
    List<AbstractModel> toModelList(List<Abstract> abstractEntityList);
    List<Abstract> toEntityList(List<AbstractModel> abstractModelList);
}
