package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {


    public static List<Flight> findFlightsFrom(String searchedDeparture) {
        List <Flight> departureTable = new ArrayList<>();
        for(Flight departure : FlightRepository.getFlightsTable()) {
            if(Flight.departure.equals(searchedDeparture)) {
                //jak dodać element z listy flightsTable do tej drugiej listy, jeśli spełnia warunek?
                //czemu nie wyciąga mi parametrów departure i arrival?
                departureTable.add(new Flight(Flight.departure, Flight.arrival));
            }
            else {
                System.out.println("No flights from the given destination.");
            }
        }
        return departureTable;
    }

    public static List<Flight> findFlightsTo(String searchedArrival) {
        List <Flight> arrivalTable = new ArrayList<>();
        for(Flight arrival : FlightRepository.getFlightsTable()) {
            if(Flight.arrival.equals(searchedArrival)) {
                arrivalTable.add(new Flight(Flight.departure, Flight.arrival));
            }
            else {
                System.out.println("No flights to the given destination.");
            }
        }
        return arrivalTable;
    }
}
