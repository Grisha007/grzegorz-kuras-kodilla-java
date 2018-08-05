package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public Map<String, Boolean> findFilght(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Wroclaw Airport", true);
        airports.put("Tokyo Airport", false);
        airports.put("London Airport", true);

        for(Map.Entry<String, Boolean> entry :airports.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey()) && (entry.getValue() == true)) {
                System.out.println("Flight status: OK!");
            } else if (flight.getArrivalAirport().equals(entry.getKey()) && (entry.getValue() == false)) {
                System.out.println("Arrival airoprt is CLOSE!");
            } else{
                throw new RouteNotFoundException("Airport is not available in database!");
            }
        }
        return airports;
    }
}
