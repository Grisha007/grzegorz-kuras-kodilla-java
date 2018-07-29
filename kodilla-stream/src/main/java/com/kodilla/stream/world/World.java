package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {
    private final List<Continent> continentCountries;

    public World(List<Continent> continentCountries) {
        this.continentCountries = continentCountries;
    }

    public List<Continent> getContinentCoutries() {
        return continentCountries;
    }
}
