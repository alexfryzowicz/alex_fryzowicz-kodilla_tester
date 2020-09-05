package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getlistOfAirports() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("miami", true);
        airports.put("malta", true);
        airports.put("laspalmas", false);
        airports.put("warsaw", true);
        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getlistOfAirports().containsKey(airport))
            return getlistOfAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
