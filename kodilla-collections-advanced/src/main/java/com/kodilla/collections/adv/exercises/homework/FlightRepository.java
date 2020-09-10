package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flightsTable;

    public static List<Flight> getFlightsTable() {
        flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw", "Brussels"));
        flightsTable.add(new Flight("London", "Paris"));
        flightsTable.add(new Flight("London", "Cracow"));
        flightsTable.add(new Flight("Cracow", "Paris"));
        flightsTable.add(new Flight("Paris", "Warsaw"));
        return flightsTable;
    }
}
