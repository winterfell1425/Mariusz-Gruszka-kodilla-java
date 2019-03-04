package com.kodilla.hibernate.manytomany.facade;

public final class CompanyDto {

    private int id;
    private  String name;

    public CompanyDto() {
    }

    public CompanyDto(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
