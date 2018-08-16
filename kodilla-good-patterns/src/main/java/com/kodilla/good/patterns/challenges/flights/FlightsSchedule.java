package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSchedule {
    public List<Flight> getFlightsSchedule() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wroclaw", "Budapest"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("London", "New York"));
        flights.add(new Flight("New York", "Budapest"));
        flights.add(new Flight("Budapest", "Warsaw"));

        return flights;
    }

    public List<Flight> searchFlightByDepartureAirport(String departureAirport) {
        return getFlightsSchedule().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightByArrivalAirport(String arrivalAirport) {
        return getFlightsSchedule().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightWithStopover(String departureAirport, String arrivalAirport) {
        getFlightsSchedule().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        getFlightsSchedule().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }
}
