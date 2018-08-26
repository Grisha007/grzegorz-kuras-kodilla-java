package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun with sesame")
                .burgers(3)
                .ingredient("becon")
                .ingredient("prowns")
                .ingredient("onion")
                .ingredient("salad")
                .ingredient("pickles")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String typeOfBun = bigmac.getBun();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("Bun with sesame", typeOfBun);
    }
}
