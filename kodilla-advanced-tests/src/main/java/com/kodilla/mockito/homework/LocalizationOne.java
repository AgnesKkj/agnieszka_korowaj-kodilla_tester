package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class LocalizationOne implements Localization {

    static Set<Person> locOneSubscribers = new HashSet<>();
    WeatherNotification locOneNotification = new WeatherNotification("Notification from Localization One");

    public void addSubscriber(Person person) {

        locOneSubscribers.add(person);
    }

    public void sendLocOneNotification(WeatherNotification locOneNotification) {
        locOneSubscribers.forEach(person -> person.receive(locOneNotification));
    }

    @Override
    public void sendLocTwoNotification(WeatherNotification weatherNotification) {
    }

    @Override
    public void sendLocThreeNotification(WeatherNotification weatherNotification) {
    }

    @Override
    public void removeSubscriber(Person person) {

        locOneSubscribers.remove(person);
    }

    @Override
    public void emptyLocalization() {
        locOneSubscribers.removeAll(locOneSubscribers);
    }


}