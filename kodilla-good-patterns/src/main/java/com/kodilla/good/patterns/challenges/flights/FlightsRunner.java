package com.kodilla.good.patterns.challenges.flights;

public class FlightsRunner {
    public static void main(String[] args) {
        FlightsSchedule flightsSchedule = new FlightsSchedule();
        flightsSchedule.searchFlightByDepartureAirport("New York");
        flightsSchedule.searchFlightByArrivalAirport("Wroclaw");
        System.out.println(flightsSchedule.searchFlightWithStopover("Wroclaw", "Warsaw"));
    }
}
