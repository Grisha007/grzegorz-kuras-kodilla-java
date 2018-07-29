package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorlPeopleQuantityTestCase {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country france = new Country("France", new BigDecimal("66000000"));
        Country egypt = new Country("Egypt", new BigDecimal("97000000"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("105000000"));
        Country japan = new Country("Japan", new BigDecimal("127000000"));
        Country vietnam = new Country("Vietnam", new BigDecimal("86000000"));

        Continent europe1 = new Continent("Europe", poland);
        Continent europe2 = new Continent("Europe", france);
        Continent africa1 = new Continent("Africa", egypt);
        Continent africa2 = new Continent("Africa", ethiopia);
        Continent asia1 = new Continent("Asia", japan);
        Continent asia2 = new Continent("Asia", vietnam);

        List<Continent> continentCountries = new ArrayList<>();
        continentCountries.add(europe1);
        continentCountries.add(europe2);
        continentCountries.add(africa1);
        continentCountries.add(africa2);
        continentCountries.add(asia1);
        continentCountries.add(asia2);

        World world = new World(continentCountries);

        //When
        BigDecimal totalPeopleQuantity = world.getContinentCoutries().stream()
                .flatMap(continent -> continent.getCountry().getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        BigDecimal expectedPeopleQuantity = new BigDecimal("521000000");

        //Then
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
