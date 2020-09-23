package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAlertService {

    private Map<Location, List<Person>> allTheLocations = new HashMap<>();

    public void addLocation(Location location) {
        System.out.println("Adding location " + location);
        allTheLocations.put(location, new ArrayList<Person>());
    }

    public void removeLocation(Location location) {
        System.out.println("Removing location " + location + " from the system.");
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if (entry.getKey().equals(location)) {
                for(Person person : entry.getValue()) {
                    entry.getKey().removeSubscriber(person);
                }
            }
        }
        allTheLocations.remove(location);
    }

    public void addSubscriber(Person person, Location location) {
        if (!allTheLocations.containsKey(location)) {
            System.out.println("Location not found. Adding location to the system.");
            this.addLocation(location);
        } else {
            System.out.println("Location found.");
        }
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if (entry.getKey().equals(location)) {
                entry.getValue().add(person);
                entry.getKey().receiveSubscriber(person);
                System.out.println("Adding subscriber " + person + " to location " + location);
            }
        }
    }

    public void removeSubscriberFromLocation(Person person, Location location) {
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if(entry.getKey().equals(location) && entry.getValue().contains(person)) {
                entry.getValue().remove(person);
                entry.getKey().removeSubscriber(person);
                System.out.println("Removing subscriber " + person + " from location " + location + ".");
            }
        }
    }

    public void removeSubscriberFromAllLocations(Person person) {
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
            if(entry.getValue().contains(person)) {
                entry.getValue().remove(person);
                entry.getKey().removeSubscriber(person);
            }
        }
        System.out.println("Removing subscriber " + person + " from all followed locations.");
    }

    public void sendNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        for (Map.Entry<Location, List<Person>> entry : this.allTheLocations.entrySet()) {
            if(entry.getKey().equals(location)) {
                entry.getValue().forEach(person -> person.receive(weatherNotification));
                System.out.println("Notification sent to subscribers of " + location);
            }
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        for (Map.Entry<Location, List<Person>> entry : this.allTheLocations.entrySet()) {
            entry.getValue().forEach(person -> person.receive(weatherNotification));
            System.out.println("Notification sent to all.");
        }
    }
}


