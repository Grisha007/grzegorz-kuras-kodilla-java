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
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");

        europe.getListOfCountries().add(new Country("Poland", new BigDecimal("40000000")));
        europe.getListOfCountries().add(new Country("France", new BigDecimal("66000000")));
        africa.getListOfCountries().add(new Country("Egypt", new BigDecimal("97000000")));
        africa.getListOfCountries().add(new Country("Ethiopia", new BigDecimal("105000000")));
        asia.getListOfCountries().add(new Country("Japan", new BigDecimal("127000000")));
        asia.getListOfCountries().add(new Country("Vietnam", new BigDecimal("86000000")));

        World world = new World();
        world.getListOfContinents().add(europe);
        world.getListOfContinents().add(africa);
        world.getListOfContinents().add(asia);


        //When
        BigDecimal peopelQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("521000000"), peopelQuantity);
    }
}
