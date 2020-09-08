package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTestSuite {

    //czy tworzy pustą tablicę
    @Test
    public void doesCreateEmptyList() {
        //given
        List<Flight> flightsTable = new ArrayList<>();
        //when
        flightsTable.size();
        //then
        assertEquals(0,flightsTable.size());
    }

    //czy tworzy obiekt klasy Flight w tablicy
    @Test
    public void doesCreateFlightObjects() {
        //given
        List<Flight> flightsTable = new ArrayList<>();
        //when
        flightsTable.add(new Flight("Warsaw", "Brussels"));
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw", "Brussels"));
        assertEquals(1,flightsTable.size());
    }






}