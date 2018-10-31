package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        System.out.println(pizzaOrder.getDescription());

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testBasicPizzaWithHotSauceGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HotSauceDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(18), theCost);
    }

    @Test
    public void testBasicPizzaWithHotSauceGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HotSauceDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + hot sauce", description);
    }

    @Test
    public void testBasicPizzaWithAdditionalCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testBasicPizzaWithAdditionalCheeseGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + additional cheese", description);
    }

    @Test
    public void testBasicPizzaWithPepperoniAndOlivesGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testBasicPizzaWithPepperoniAndOlivesGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + pepperoni + olives", description);
    }
}
