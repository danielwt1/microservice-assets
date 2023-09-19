package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;


import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.AssetsResponseDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.response.AssetsResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AssetModelMapper {
    AssetsResponseDTO toDTO(AssetsResponseModel assetsResponseModel);
    List<AssetsResponseDTO> toListDTO(List<AssetsResponseModel> assetsResponseModel);
    List<AssetsResponseModel> toListModel(List<AssetsResponseDTO> assets);
}
