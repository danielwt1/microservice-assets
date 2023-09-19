package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LicenseDTO extends AbstractDTO{
    private Long licenseId;
    private String provider;
    private LocalDateTime expirationDate;
    private String licenseState;
}
