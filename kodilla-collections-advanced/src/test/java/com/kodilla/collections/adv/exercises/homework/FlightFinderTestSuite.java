package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

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
        assertEquals(expectedFlights, FlightFinder.findFlightsFrom("London"));
    }

    @Test
    public void doesFindArrivals() {
      //when
        List <Flight> result = FlightFinder.findFlightsTo("Paris");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("London", "Paris"));
        expectedFlights.add(new Flight("Cracow", "Paris"));
        assertEquals(expectedFlights, FlightFinder.findFlightsTo("Paris"));
    }

    @Test
    public void doesFailToReturnIfNothingFound() {
        //when
        List <Flight> resultDep = FlightFinder.findFlightsFrom("Dubai");
        List <Flight> resultArr = FlightFinder.findFlightsTo("Dubai");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        assertEquals(expectedFlights, resultDep);
        assertEquals(expectedFlights, resultArr);
    }
}