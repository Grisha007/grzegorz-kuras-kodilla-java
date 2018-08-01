package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite{
    @Test
    public void testGetAverage(){
        //Given
        int arrayOfNumbers[] = new int[20];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 2;
        arrayOfNumbers[2] = 3;
        arrayOfNumbers[3] = 4;
        arrayOfNumbers[4] = 5;
        arrayOfNumbers[5] = 6;
        arrayOfNumbers[6] = 7;
        arrayOfNumbers[7] = 8;
        arrayOfNumbers[8] = 9;
        arrayOfNumbers[9] = 10;
        arrayOfNumbers[10] = 11;
        arrayOfNumbers[11] = 12;
        arrayOfNumbers[12] = 13;
        arrayOfNumbers[13] = 14;
        arrayOfNumbers[14] = 15;
        arrayOfNumbers[15] = 16;
        arrayOfNumbers[16] = 17;
        arrayOfNumbers[17] = 18;
        arrayOfNumbers[18] = 19;
        arrayOfNumbers[19] = 20;

        //When
        double numbersAverage = ArrayOperations.getAverage(arrayOfNumbers);

        //Then
        Assert.assertEquals(10.5, numbersAverage, 0.001);
    }
}
