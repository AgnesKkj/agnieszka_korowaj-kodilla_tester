package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTestSuite {

    AirportRepository airportRepository = new AirportRepository();

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }

//dopisujemy, że test ma na celu wyrzucenie wyjątku
    @Test (expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        //then
        assertFalse(isWarsawInUse);
    }






}