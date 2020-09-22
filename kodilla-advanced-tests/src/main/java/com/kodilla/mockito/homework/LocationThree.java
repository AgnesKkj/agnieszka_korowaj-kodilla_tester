package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class LocationThree implements Location {
    static Set<Person> locThreeSubscribers = new HashSet<>();
    WeatherNotification locThreeNotification = new WeatherNotification("Notification from Location Three");

    public void addSubscriber(Person person) {
        locThreeSubscribers.add(person);
    }

    public void sendLocOneNotification(WeatherNotification weatherNotification) {
        return;
    }

    public void sendLocTwoNotification(WeatherNotification weatherNotification) {
        return;
    }

    public void sendLocThreeNotification(WeatherNotification locThreeNotification) {
        locThreeSubscribers.forEach(person -> person.receive(locThreeNotification));

    }

    @Override
    public void removeSubscriber(Person person) {
        locThreeSubscribers.remove(person);
    }

    public void emptyLocalization() {
        locThreeSubscribers.clear();
    }

}