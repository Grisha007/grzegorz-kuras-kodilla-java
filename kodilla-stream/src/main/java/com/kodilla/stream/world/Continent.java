package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Country country;

    public Continent(final String continentName, final Country country){
        this.continentName = continentName;
        this.country = country;
    }

    public String getContinentName() {
        return continentName;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", country=" + country +
                '}';
    }
}
