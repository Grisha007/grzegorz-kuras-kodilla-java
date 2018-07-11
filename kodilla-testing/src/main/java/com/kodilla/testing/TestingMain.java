package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser user1 = new SimpleUser("Name1");

        String result = user1.getUsername();

        if(result.equals("Name1")){
            System.out.println("OK");
        } else{
            System.out.println("ERROR");
        }

        System.out.println("TEST - pierwszy test jednostkowy\n");

        System.out.println("Calculator test");
        System.out.println("==================\n");

        Calculator calculator1 = new Calculator(9, 5);

        int addResult = calculator1.add();
        int subtractResult = calculator1.subtract();

        System.out.println("Add test: " + addResult);
        System.out.println("Subtract test: " + subtractResult);
    }
}
