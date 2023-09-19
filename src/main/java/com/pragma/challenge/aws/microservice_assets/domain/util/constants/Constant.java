package com.pragma.challenge.aws.microservice_assets.domain.util.constants;


import java.util.List;

public class Constant {
    public static final List<String> VALID_STATES_OF_ARCH_TECH = List.of("Operativo", "Dañado", "Reparación", "Transporte", "Conflicto y Perdido");
    public static final List<String> VALID_STATES_OF_FURNITURE = List.of("Operativo", "Dañado", "Transporte", "Perdido", "Conflicto");
    public static final List<String> VALID_STATES_OF_ABSTRACT = List.of("ACTIVO","INACTIVO");
    public static final List<String> VALID_STATES_OF_LICENSE = List.of("ACTIVO","INACTIVO","VENCIDO");
}
