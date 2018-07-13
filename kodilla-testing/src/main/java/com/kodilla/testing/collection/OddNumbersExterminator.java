package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    private ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        for(int evenNum : numbers){
            if(evenNum % 2 == 0){
                evenNumbers.add(evenNum);
                //System.out.println("Even number of evenNumbers list: " + evenNumbers.get(evenNum));
            } else {
                System.out.println("Odd number has been exterminated");
            }

            System.out.println("Size of evenNumbers list: " + evenNumbers.size());
        }

        return evenNumbers;
    }
}
