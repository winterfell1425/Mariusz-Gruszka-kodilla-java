package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "peopleQuantity=" + peopleQuantity +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
