package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AbstractDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.AbstractModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AbstractModelMapper {
    AbstractModel toModel(AbstractDTO dto);
    AbstractDTO toDTO(AbstractModel model);
    List<AbstractModel> toModelList(List<AbstractDTO> dtos);
    List<AbstractDTO> toDTOList(List<AbstractModel> models);
}
