package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class LocationTwo implements Location {

    static Set<Person> locTwoSubscribers = new HashSet<>();
    WeatherNotification locTwoNotification = new WeatherNotification("Notification from Localization Two");

    public void addSubscriber(Person person) {
        locTwoSubscribers.add(person);
    }

    @Override
    public void sendLocOneNotification(WeatherNotification weatherNotification) {
        return;
    }

    @Override
    public void sendLocTwoNotification(WeatherNotification locTwoNotification) {
        locTwoSubscribers.forEach(person -> person.receive(locTwoNotification));
    }

    @Override
    public void sendLocThreeNotification(WeatherNotification weatherNotification) {
        return;
    }

    @Override
    public void removeSubscriber(Person person) {
        locTwoSubscribers.remove(person);
    }

    public void emptyLocalization() {
        locTwoSubscribers.clear();
    }

}
