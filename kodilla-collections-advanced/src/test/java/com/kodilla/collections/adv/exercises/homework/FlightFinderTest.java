package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {
        //given
        List<Flight> result = flightFinder.findFlightsFrom("Katowice");
        List<Flight> expectedList = new ArrayList<>();
        //when
        expectedList.add(new Flight("Katowice", "Radom"));
        expectedList.add(new Flight("Katowice", "Las Vegas"));
        expectedList.add(new Flight("Katowice", "Tokyo"));
        //then
        assertEquals(4, result.size());
    }

    @Test
    public void testFindFlightsTo() {
        //given
        List<Flight> result = flightFinder.findFlightsTo("Katowice");
        List<Flight> expectedList = new ArrayList<>();
        //when
        expectedList.add(new Flight("Mexico", "Katowice"));
        expectedList.add(new Flight("Wybrzeże Kości Słoniowej", "Katowice"));
        //then
        assertEquals(4, result.size());
    }
}
