package com.pragma.challenge.aws.microservice_assets.domain.util.validators;

import java.util.List;

public class Validators {

    public static  <T>  boolean isValidState(T value, List<T> validStates){
        return validStates.contains(value);
    }
}
