package com.kodilla.exception.test;

import java.util.Map;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Wroclaw Airport", "Tokyo Airport");

        FlightSearch flightSearcher = new FlightSearch();

        try {
            Map<String, Boolean> flightStatus = flightSearcher.findFilght(flight1);
            System.out.println(flightStatus);
        } catch(RouteNotFoundException e){
            System.out.println("Error occured! Error status: " + e);
        } finally{
            System.out.println("Please check your arrival airport!");
        }
    }
}
