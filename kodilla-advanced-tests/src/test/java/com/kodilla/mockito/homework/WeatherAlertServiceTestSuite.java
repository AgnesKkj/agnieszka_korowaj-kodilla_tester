package com.kodilla.mockito.homework;

import org.junit.jupiter.api.*;
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
    public void shouldAddSubscriberIfLocationIsInTheSystem() {
        weatherAlertService.addLocation(location);
        weatherAlertService.addSubscriber(person, location);
        Mockito.verify(location, Mockito.times(1)).receiveSubscriber(person);
    }

    @Test
    public void shouldAddSubscriberIfLocationWasNotTheSystem() {
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
    public void shouldUnsubscribePersonFromLocation() {
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.removeSubscriberFromLocation(person, location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
    }

    @Test
    public void personUnsubbedFromLocationShouldNotReceiveNotificationsFromLocation() {
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.removeSubscriberFromLocation(person, location);
        weatherAlertService.sendNotificationToLocation(weatherNotification,location);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldUnsubscribePersonFromAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(person, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(person);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
        Mockito.verify(locationTwo, Mockito.times(1)).removeSubscriber(person);
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

    @Test
    public void personUnsubscribedFromAnyLocationShouldNotReceiveNotificationsToAll() {
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.removeSubscriberFromLocation(person, location);
        weatherAlertService.sendNotificationToAll(weatherNotification);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void personUnsubscribedFromAllShouldNotReceiveNotificationsToAll() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(person, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(person);
        weatherAlertService.sendNotificationToAll(weatherNotification);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void personUnsubscribedFromAllShouldNotReceiveAnyLocalNotifications() {
        Location locationTwo = Mockito.mock(Location.class);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(person, locationTwo);
        weatherAlertService.removeSubscriberFromAllLocations(person);
        weatherAlertService.sendNotificationToLocation(weatherNotification,location);
        weatherAlertService.sendNotificationToLocation(weatherNotification,locationTwo);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void shouldNotSendNotificationsToAllIfAllUnsubscribed() {
        Person personTwo = Mockito.mock(Person.class);
        Location locationTwo = Mockito.mock(Location.class);
        Person personThree = Mockito.mock(Person.class);
        Location locationThree = Mockito.mock(Location.class);

        weatherAlertService.addSubscriber(personTwo, locationTwo);
        weatherAlertService.addSubscriber(person, location);
        weatherAlertService.addSubscriber(personThree, locationThree);

        weatherAlertService.removeSubscriberFromLocation(person, location);
        weatherAlertService.removeSubscriberFromLocation(personTwo, locationTwo);
        weatherAlertService.removeSubscriberFromLocation(personThree, locationThree);

        weatherAlertService.sendNotificationToAll(weatherNotification);

        Mockito.verify(personTwo, Mockito.never()).receive(weatherNotification);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personThree, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void allShouldBeUnsubbedFromRemovedLocation() {
        Person personTwo = Mockito.mock(Person.class);
        weatherAlertService.addSubscriber(person,location);
        weatherAlertService.addSubscriber(personTwo,location);
        weatherAlertService.removeLocation(location);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(person);
        Mockito.verify(location, Mockito.times(1)).removeSubscriber(personTwo);
    }

    @Test
    public void personShouldNotReceiveNotificationsFromRemovedLocation() {
        weatherAlertService.addSubscriber(person,location);
        weatherAlertService.removeLocation(location);
        weatherAlertService.sendNotificationToLocation(weatherNotification,location);
        Mockito.verify(person, Mockito.never()).receive(weatherNotification);
    }

    @BeforeAll
    public static void initiateTesting() {
        System.out.println("Beginning testing.");
    }

    @BeforeEach
    public void initializeTest() {
        System.out.println("Running test...");
    }

    @AfterEach
    public void endTest() {
        System.out.println("-----");
    }

    @AfterAll
    public static void closeTesting(){
        System.out.println("Ending testing.");
    }

}