package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.mapper;

import com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto.LicenseDTO;
import com.pragma.challenge.aws.microservice_assets.domain.model.LicenseModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface LicenseModelMapper {
    LicenseModel toModel(LicenseDTO licenseDTO);
    LicenseDTO toDTO(LicenseModel licenseModel);

}
