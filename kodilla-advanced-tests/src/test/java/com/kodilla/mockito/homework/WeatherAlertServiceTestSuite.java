package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class WeatherAlertServiceTestSuite {

    WeatherAlertService weatherAlertService = new WeatherAlertService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedPersonShouldNotReceiveNotifications() {
        weatherAlertService.addLocation(location);
        weatherAlertService.sendNotificationToLocation(location);
        Mockito.verify(person, Mockito.never().receive(notification));
    }

    @Test
    public void subscribedPersonShouldReceiveNotificationIfLocationIsPresent() {
        weatherAlertService.addLocation(location);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.sendNotificationToLocation(location);
        Mockito.verify(person, Mockito.never().receive(notification));
    }

    @Test
    public void shouldAddSubscriberIfLocationWasNotPresent() {
        weatherAlertService.addSubscriber(person, location);
        Mockito.verify(location, Mockito.times(1).receiveSubscriber(person));
    }

    @Test
    public void shouldSendNotificationToAllWithRelevantMethod() {
        Person personTwo = Mockito.mock(Person.class);
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(personTwo, locationTwo);
        weatherAlertService.sendNotificationToAll();
        Mockito.verify(person, Mockito.times(1).receive(notification));
        Mockito.verify(personTwo, Mockito.times(1).receive(notification));
    }


}