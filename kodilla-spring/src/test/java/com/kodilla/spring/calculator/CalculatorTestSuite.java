package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(10.0, 25.0);
        double sub = calculator.sub(50.5, 35.5);
        double mul = calculator.mul(52.0, 15.5);
        double div = calculator.div(18.5, 20.0);
        //Then
        Assert.assertEquals(35.0, add, 0.01);
        Assert.assertEquals(15.0, sub, 0.01);
        Assert.assertEquals(806.0, mul, 0.01);
        Assert.assertEquals(0.925, div, 0.01);
    }
}
