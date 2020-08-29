package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    Map<String, List<Flight>> flightsTable = new HashMap<>();

//    public void someFlight(String departure, String arrival) {
//        List<Flight> flights = flightsTable.getOrDefault(departure, new ArrayList<>());
//    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> actualTable = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure))
                actualTable.add(flight);
        }
        return actualTable;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> actualTable = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                actualTable.add(flight);
        }
        return actualTable;
    }

}
