package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportNotFoundException extends Exception{
    private Map<String, Boolean> getListOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("miami", true);
        airports.put("malta", true);
        airports.put("laspalmas", false);
        airports.put("warsaw", true);
        return airports;
    }
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
