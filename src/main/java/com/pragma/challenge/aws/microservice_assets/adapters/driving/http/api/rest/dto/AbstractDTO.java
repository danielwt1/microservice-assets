package com.pragma.challenge.aws.microservice_assets.adapters.driving.http.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class AbstractDTO extends AssetDTO {
    private String url;


}
