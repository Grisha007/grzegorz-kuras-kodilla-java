package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> fewNumbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            fewNumbers.add(i);
        }
        System.out.println("Size of fewNumbers list: " + fewNumbers.size());
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> evenNumbers = oddExterminator.exterminate(fewNumbers);
        //Then
        Assert.assertNotEquals(0, evenNumbers.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> fewNumbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            fewNumbers.add(i);
        }
        System.out.println("Size of fewNumbers list: " + fewNumbers.size());
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> evenNumbers = oddExterminator.exterminate(fewNumbers);
        //Then
        for(int num : evenNumbers){
            if(num % 2 == 0){
                System.out.println("Number is even. Test result: OK");
            } else if(num % 2 != 0) {
                System.out.println("Number is odd. Test result: ERROR");
            } else {
                System.out.println("Wrong number. Test result: ERROR");
            }
        }
        Assert.assertEquals(5, evenNumbers.size());
    }
}
