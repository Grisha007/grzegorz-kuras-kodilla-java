package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Wroclaw Airport", true);
        airports.put("Tokyo Airport", false);
        airports.put("London Airport", true);

        if (airports.containsKey(flight.getArrivalAirport())) {

            boolean status = airports.get(flight.getArrivalAirport());

            if (status == true) {
                System.out.println("Flight status: OK!");
            } else {
                System.out.println("Arrival airport is CLOSE!");
            }
        } else {
            throw new RouteNotFoundException("Airport is not available in database!");
        }
    }
}
