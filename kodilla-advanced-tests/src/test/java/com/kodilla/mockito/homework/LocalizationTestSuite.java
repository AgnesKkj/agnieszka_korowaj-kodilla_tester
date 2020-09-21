package com.kodilla.mockito.homework;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LocalizationTestSuite {

    Localization localizationOne = new LocalizationOne();
    Localization localizationTwo = new LocalizationTwo();
    Localization localizationThree = new LocalizationThree();
    Person personOne = Mockito.mock(Person.class);
    Person personTwo = Mockito.mock(Person.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    //osoba nie otrzymuje powiadomień, jeśli nie zapisała się do żadnej lokalizacji
    @Test
    public void notSubscribedPersonShouldNotReceiveNotification() {
        localizationOne.sendLocOneNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
    }

    //osoba otrzymuje notyfikacje z właściwej lokalizacji
    @Test
    public void subscribedPersonShouldReceiveTheRightNotificationFromEachLocalization() {
        localizationOne.addSubscriber(personOne);
        localizationOne.sendLocOneNotification(weatherNotification);
        localizationThree.sendLocThreeNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(weatherNotification);
    }

    //osoba nie otrzymuje powiadomień z niewłaściwej lokalizacji
    @Test
    public void subscribedPersonShouldNotReceiveOtherNotifications() {
        localizationOne.addSubscriber(personOne);
        localizationTwo.sendLocTwoNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
    }

    //osoba przestaje otrzymywać notyfikacje, jeśli wypisuje się z >=1 lokalizacji
    @Test
    public void subscriberStopsReceivingNotificationsWhenUnsub() {
        localizationOne.addSubscriber(personOne);
        localizationTwo.addSubscriber(personOne);
        localizationOne.removeSubscriber(personOne);
        localizationTwo.removeSubscriber(personOne);
        localizationOne.sendLocOneNotification(weatherNotification);
        localizationTwo.sendLocTwoNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
    }

    //test "usunięcia" lokalizacji (opróżnienia kolekcji)
    @Test
    public void localizationDoesNotSendNotificationsWhenEmpty() {
        localizationOne.addSubscriber(personOne);
        localizationOne.addSubscriber(personTwo);
        localizationOne.emptyLocalization();
        localizationOne.sendLocOneNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personTwo, Mockito.never()).receive(weatherNotification);
    }

    //system wysyła specjalne powiadomienie do wszystkich
    @Test
    public void defaultNotificationSentToAll() {
        localizationOne.addSubscriber(personOne);
        localizationOne.addSubscriber(personTwo);
        Localization.sendDefaultNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(personTwo, Mockito.times(1)).receive(weatherNotification);
    }

    //powiadomienie "do wszystkich" nie dociera do osób niezapisanych do żadnej lokalizacji
    @Test
    public void nobodyGetsDefaultNotificationIfNobodySubscribed() {
        Localization.sendDefaultNotification(weatherNotification);
        Mockito.verify(personOne, Mockito.never()).receive(weatherNotification);
        Mockito.verify(personTwo, Mockito.never()).receive(weatherNotification);
    }

}