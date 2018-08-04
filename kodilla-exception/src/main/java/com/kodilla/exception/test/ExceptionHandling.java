package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.5, 4.5);
        } catch(Exception e){
            System.out.println("Problem with execution \"probablyIWillThrowException()\" method! Error: " + e);
        } finally {
            System.out.println("Please check parameters.");
        }
    }
}
