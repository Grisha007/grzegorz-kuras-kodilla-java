package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent(final String continentName){
        this.continentName = continentName;
    }

    public List<Country> getListOfCountries(){
        return listOfCountries;
    }
}
