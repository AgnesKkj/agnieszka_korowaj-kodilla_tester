package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void notSubscribedPersonShouldNotReceiveNotifications() {
        weatherAlertService.addLocation(location);
        weatherAlertService.sendNotificationToLocation(location);
        Mockito.verify(person, Mockito.never().receive(weatherNotification));
    }

    @Test
    public void shouldAddSubscriberIfLocationIsPresent() {
        weatherAlertService.addLocation(location);
        weatherAlertService.addSubscriber(person, location);
        Mockito.verify(location, Mockito.times(1).receiveSubscriber(person));
    }

    @Test
    public void shouldAddSubscriberWithLocationIfLocationWasNotPresent() {
        weatherAlertService.addSubscriber(person, location);
        Mockito.verify(location, Mockito.times(1).receiveSubscriber(person));
    }

    @Test
    public void subscribedPersonShouldReceiveNotification() {
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.sendNotificationToLocation(location);
        Mockito.verify(person, Mockito.never().receive(weatherNotification));
    }

    @Test
    public void shouldSendNotificationToAllWithRelevantMethod() {
        Person personTwo = Mockito.mock(Person.class);
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(personTwo, locationTwo);
        weatherAlertService.sendNotificationToAll();
        Mockito.verify(person, Mockito.times(1).receive(weatherNotification));
        Mockito.verify(personTwo, Mockito.times(1).receive(weatherNotification));
    }


}