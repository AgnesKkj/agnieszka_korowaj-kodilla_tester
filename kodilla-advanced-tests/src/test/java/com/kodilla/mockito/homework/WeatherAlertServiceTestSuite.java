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
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldAddLocation() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addLocation(locationTwo);
        weatherAlertService.addSubscriber(person, locationTwo);
        Mockito.verify(locationTwo, Mockito.times(1)).receiveSubscriber(person);
    }


    @Test
    public void shouldAddSubscriber() {
        weatherAlertService.addLocation(location);
        weatherAlertService.addSubscriber(person, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(person);
    }

    @Test
    public void subscribedPersonShouldReceiveNotificationFromRightLocation() {
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.sendNotificationToLocation(weatherNotification, location);
        Mockito.verify(person, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscribedPersonShouldNotReceiveNotificationFromWrongLocation() {
        weatherAlertService.addSubscriber(person, location);
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.sendNotificationToLocation(weatherNotification, locationTwo);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldSendNotificationToAllWithRelevantMethod() {
        Person personTwo = Mockito.mock(Person.class);
        Location locationTwo = Mockito.mock(Location.class);
        Person personThree = Mockito.mock(Person.class);
        Location locationThree = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(personTwo, locationTwo);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(personThree, locationThree);
        weatherAlertService.sendNotificationToAll(weatherNotification);
        Mockito.verify(personTwo, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(person, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(personThree, Mockito.times(1)).receive(weatherNotification);
    }

}