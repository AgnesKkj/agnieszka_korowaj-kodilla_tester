package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAlertService {

    private Map<Location, List<Person>> allTheLocations = new HashMap<>();
    private WeatherNotification weatherNotification;

    public Map<Location, List<Person>> addLocation(Location location) {
        System.out.println("Adding location.");
        allTheLocations.put(location, new ArrayList<Person>());
        return allTheLocations;
    }

    public void removeLocation(Location location) {
        System.out.println("Removing location." );
        allTheLocations.remove(location);
    }

    public void addSubscriber(Person person, Location location) {
        if (!allTheLocations.containsKey(location)) {
            System.out.println("Location not found. Adding location.");
            this.addLocation(location);
        } else {
            System.out.println("Location found.");
        }
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            entry.getValue().add(person);
            entry.getKey().receiveSubscriber(person);
            System.out.println("Adding subscriber to location.");
        }
    }

    public void sendNotificationToLocation(Location location) {
        for (Map.Entry<Location, List<Person>> entry : this.allTheLocations.entrySet()) {
            if(entry.getKey().equals(location)) {
                entry.getValue().forEach(person -> person.receive(weatherNotification));
            }
        }
    }

    public void sendNotificationToAll() {
        for (Map.Entry<Location, List<Person>> entry : this.allTheLocations.entrySet()) {
            entry.getValue().forEach(person -> person.receive(weatherNotification));
        }
    }
}


