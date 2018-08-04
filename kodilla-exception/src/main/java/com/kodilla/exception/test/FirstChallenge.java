package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            try{
                throw new ArithmeticException();
            } catch(ArithmeticException ae){
                System.out.println("Oh no! Something went wrong! Error: " + ae);
            } finally{
                System.out.println("Please correct \"b\" parameter!");
            }
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
