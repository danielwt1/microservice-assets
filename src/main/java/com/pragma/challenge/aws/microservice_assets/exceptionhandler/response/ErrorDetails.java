package com.pragma.challenge.aws.microservice_assets.exceptionhandler.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;


@AllArgsConstructor
@Getter
public class ErrorDetails {
    private String message;
    private LocalDate date;
    private String path;
}
