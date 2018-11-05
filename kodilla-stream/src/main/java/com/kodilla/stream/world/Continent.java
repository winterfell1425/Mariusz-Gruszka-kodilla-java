package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;

    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }
}

