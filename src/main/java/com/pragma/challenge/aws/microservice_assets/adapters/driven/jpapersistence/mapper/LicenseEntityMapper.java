package com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driven.jpapersistence.entity.License;
import com.pragma.challenge.aws.microservice_assets.domain.model.LicenseModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LicenseEntityMapper {
    License toEntity(LicenseModel  licenseModel);
    LicenseModel toModel(License license);
    List<LicenseModel> toModelList(List<License> licenseEntityList);
    List<License> toEntityList(List<LicenseModel> licenseModelList);
}
