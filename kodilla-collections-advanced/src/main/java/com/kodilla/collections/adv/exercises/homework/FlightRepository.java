package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flightsTable = new ArrayList<>();

    public static List<Flight> getFlightsTable() {
        return flightsTable;
    }

    public int size() {
        return flightsTable.size();
    }
}
