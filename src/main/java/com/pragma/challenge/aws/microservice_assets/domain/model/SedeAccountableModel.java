package com.pragma.challenge.aws.microservice_assets.domain.model;

public class SedeAccountableModel {
    private String nameCompany;
    private String city;

    public SedeAccountableModel() {
    }

    public SedeAccountableModel(String nameCompany, String city) {
        this.nameCompany = nameCompany;
        this.city = city;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
