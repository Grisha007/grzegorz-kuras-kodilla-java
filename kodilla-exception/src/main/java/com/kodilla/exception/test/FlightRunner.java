package com.kodilla.exception.test;

import java.util.Map;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Wroclaw Airport", "Budapest Airport");

        FlightSearch flightSearcher = new FlightSearch();

        try {
            flightSearcher.findFilght(flight1);
        } catch(RouteNotFoundException e){
            System.out.println("Error occured! Error status: " + e);
        } finally{
            System.out.println("Have a nice day!");
        }
    }
}
