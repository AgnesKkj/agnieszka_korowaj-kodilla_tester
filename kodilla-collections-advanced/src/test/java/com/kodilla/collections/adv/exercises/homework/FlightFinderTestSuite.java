package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    List<Flight> flightsTable = new ArrayList<>();

    @Test
    public void doesAddTheRightFlights() {
        //when
        FlightRepository.getFlightsTable();
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw", "Brussels"));
        expectedFlights.add(new Flight("London", "Paris"));
        expectedFlights.add(new Flight("London", "Cracow"));
        expectedFlights.add(new Flight("Cracow", "Paris"));
        expectedFlights.add(new Flight("Paris", "Warsaw"));
        assertEquals(expectedFlights, FlightRepository.getFlightsTable());
    }

    @Test
    public void doesFindDepartures() {
      //when
        List <Flight> result = FlightFinder.findFlightsFrom("London");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("London", "Paris"));
        expectedFlights.add(new Flight("London", "Cracow"));
        assertEquals(2, result.size());
    }

    @Test
    public void doesFindArrivals() {
      //when
        List <Flight> result = FlightFinder.findFlightsTo("Paris");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("London", "Paris"));
        expectedFlights.add(new Flight("Cracow", "Paris"));
        assertEquals(2, result.size());
    }


}