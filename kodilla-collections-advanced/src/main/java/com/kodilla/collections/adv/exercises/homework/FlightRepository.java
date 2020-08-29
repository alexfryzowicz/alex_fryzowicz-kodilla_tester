package com.kodilla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new LinkedList<>();
        flightsTable.add(new Flight("Katowice", "Tokyo"));
        flightsTable.add(new Flight("Katowice", "Radom"));
        flightsTable.add(new Flight("Katowice", "Las Vegas"));

        flightsTable.add(new Flight("Mexico", "Katowice"));
        flightsTable.add(new Flight("Wybrzeże Kości Słoniowej", "Katowice"));

        return flightsTable;
    }

    public static void main(String[] args) {

    }
}
