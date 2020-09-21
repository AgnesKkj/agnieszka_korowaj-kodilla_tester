package com.kodilla.mockito.homework;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LocationTestSuite {

    Location locationOne = new LocationOne();
    Location locationTwo = new LocationTwo();
    Location locationThree = new LocationThree();
    Person personOne = Mockito.mock(Person.class);
    Person personTwo = Mockito.mock(Person.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    //osoba nie otrzymuje powiadomień, jeśli nie zapisała się do żadnej lokalizacji
    @Test
    public void notSubscribedPersonShouldNotReceiveNotification() {
        locationOne.sendLocOneNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
    }

    //osoba otrzymuje notyfikacje z właściwej lokalizacji
    @Test
    public void subscribedPersonShouldReceiveTheRightNotificationFromEachLocation() {
        locationOne.addSubscriber(personOne);
        locationOne.sendLocOneNotification(weatherNotification);
        locationThree.sendLocThreeNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(weatherNotification);
    }

    //osoba nie otrzymuje powiadomień z niewłaściwej lokalizacji
    @Test
    public void subscribedPersonShouldNotReceiveNotificationsFromOtherLocations() {
        locationOne.addSubscriber(personOne);
        locationTwo.sendLocTwoNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
    }

    //osoba przestaje otrzymywać notyfikacje, jeśli wypisuje się z >=1 lokalizacji
    @Test
    public void subscriberStopsReceivingNotificationsWhenUnsubscribed() {
        locationOne.addSubscriber(personOne);
        locationTwo.addSubscriber(personOne);
        locationOne.removeSubscriber(personOne);
        locationTwo.removeSubscriber(personOne);
        locationOne.sendLocOneNotification(weatherNotification);
        locationTwo.sendLocTwoNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
    }

    //test "usunięcia" lokalizacji (opróżnienia kolekcji)
    @Test
    public void locationDoesNotSendNotificationsWhenEmpty() {
        locationOne.addSubscriber(personOne);
        locationOne.addSubscriber(personTwo);
        locationOne.emptyLocalization();
        locationOne.sendLocOneNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personTwo, Mockito.never()).receive(weatherNotification);
    }

    //system wysyła specjalne powiadomienie do wszystkich
    @Test
    public void defaultNotificationSentToAll() {
        locationOne.addSubscriber(personOne);
        locationOne.addSubscriber(personTwo);
        Location.sendDefaultNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(personTwo, Mockito.times(1)).receive(weatherNotification);
    }

    //powiadomienie "do wszystkich" nie dociera do osób niezapisanych do żadnej lokalizacji
    @Test
    public void nobodyGetsDefaultNotificationIfNobodySubscribed() {
        Location.sendDefaultNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personTwo, Mockito.never()).receive(weatherNotification);
    }

}