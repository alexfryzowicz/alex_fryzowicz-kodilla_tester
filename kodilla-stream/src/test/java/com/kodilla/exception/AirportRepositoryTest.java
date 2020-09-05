package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTest {
    @Test
    public void testIsAirpotrInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("warsaw");
        //then
        assertTrue(isWarsawInUse);
    }

    @Test(expected = AirportNotFoundException.class) //rzucenie wyjątku jest sytuacją poprawną, nie wyświetli błędu
    public void testIsAirportInUse_withExeption() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("vienna");
        //then
        assertFalse(isWarsawInUse);
    }

}