package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.Asset;
import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.projections.AssetResponseProjection;
import com.pragma.challenge.aws.microservice_assets.domain.model.AssetModel;
import com.pragma.challenge.aws.microservice_assets.domain.model.response.AssetsResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AssetEntityMapper {
    Asset toEntity(AssetModel  assetModel);
    AssetModel toModel(Asset asset);
    List<AssetModel> toModelList(List<Asset> assetEntityList);
    List<Asset> toEntityList(List<AssetModel> assetModelList);
    List<AssetsResponseModel> toResponseModelList(List<AssetResponseProjection> assetEntityList);
}
