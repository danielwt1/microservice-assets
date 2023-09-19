package com.pragma.challenge.aws.microservice_assets.domain.model;

public class AccountableMaintenanceModel {
    private String email;
    private String name;
    private String empresaName;

    public AccountableMaintenanceModel() {
    }

    public AccountableMaintenanceModel(String email, String name, String empresaName) {
        this.email = email;
        this.name = name;
        this.empresaName = empresaName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpresaName() {
        return empresaName;
    }

    public void setEmpresaName(String empresaName) {
        this.empresaName = empresaName;
    }
}
