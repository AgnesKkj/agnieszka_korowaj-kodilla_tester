package com.kodilla.mockito.homework;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LocalizationTestSuite {

    Localization localizationOne = new LocalizationOne();
    Localization localizationTwo = new LocalizationOne();
    Localization localizationThree = new LocalizationOne();
    Person personOne = Mockito.mock(Person.class);
    Person personTwo = Mockito.mock(Person.class);
    WeatherNotification locOneNotification = Mockito.mock(WeatherNotification.class);
    WeatherNotification locTwoNotification = Mockito.mock(WeatherNotification.class);
    WeatherNotification locThreeNotification = Mockito.mock(WeatherNotification.class);
    WeatherNotification defaultNotification = Mockito.mock(WeatherNotification.class);

    //osoba nie otrzymuje powiadomień, jeśli nie zapisała się do żadnej lokalizacji
    @Test
    public void notSubscribedPersonShouldNotReceiveNotification() {
        localizationOne.sendLocOneNotification(locOneNotification);
        Mockito.verify(personOne, Mockito.never()).receive(locOneNotification);
    }

    //osoba otrzymuje właściwe notyfikacje, jeśli zapisała się do >= 1 lokalizacji
    @Test
    public void subscribedPersonShouldReceiveTheRightNotification() {
        localizationOne.addSubscriber(personOne);
        localizationOne.sendLocOneNotification(locOneNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(locOneNotification);
        localizationThree.addSubscriber(personOne);
        localizationThree.sendLocThreeNotification(locThreeNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(locThreeNotification);
    }

    //osoba nie otrzymuje powiadomień z niewłaściwej lokalizacji
    @Test
    public void subscribedPersonShouldNotReceiveOtherNotifications() {
        localizationOne.addSubscriber(personOne);
        localizationTwo.sendLocTwoNotification(locTwoNotification);
        Mockito.verify(personOne, Mockito.never()).receive(locTwoNotification);
        localizationThree.sendLocThreeNotification(locThreeNotification);
        Mockito.verify(personOne, Mockito.never()).receive(locThreeNotification);
    }

    //osoba przestaje otrzymywać notyfikacje, jeśli wypisuje się z >=1 lokalizacji
    @Test
    public void subscriberStopsReceivingNotificationsWhenUnsub() {
        localizationOne.addSubscriber(personOne);
        localizationTwo.addSubscriber(personOne);
        localizationOne.removeSubscriber(personOne);
        localizationTwo.removeSubscriber(personOne);
        localizationOne.sendLocOneNotification(locOneNotification);
        localizationTwo.sendLocTwoNotification(locTwoNotification);
        Mockito.verify(personOne, Mockito.never()).receive(locOneNotification);
        Mockito.verify(personOne, Mockito.never()).receive(locTwoNotification);
    }

    //test "usunięcia" lokalizacji (opróżnienia kolekcji)
    @Test
    public void localizationStopsSendingNotificationsWhenEmpty() {
        localizationOne.addSubscriber(personOne);
        localizationOne.addSubscriber(personTwo);
        localizationOne.sendLocOneNotification(locOneNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(locOneNotification);
        localizationOne.emptyLocalization();
        localizationOne.sendLocOneNotification(locOneNotification);
        Mockito.verify(personOne, Mockito.never()).receive(locOneNotification);
        Mockito.verify(personTwo, Mockito.never()).receive(locOneNotification);
    }

    //system wysyła specjalne powiadomienie do wszystkich
    @Test
    public void defaultNotificationSentToAll() {
        localizationOne.addSubscriber(personOne);
        localizationOne.addSubscriber(personTwo);
        Localization.sendDefaultNotification(defaultNotification);
        Mockito.verify(personOne, Mockito.times(1)).receive(defaultNotification);
        Mockito.verify(personTwo, Mockito.times(1)).receive(defaultNotification);
    }

    //powiadomienie "do wszystkich" nie dociera do osób niezapisanych do żadnej lokalizacji
    @Test
    public void nobodyGetsDefaultNotificationIfNobodySubscribed() {
        Localization.sendDefaultNotification(defaultNotification);
        Mockito.verify(personOne, Mockito.never()).receive(defaultNotification);
        Mockito.verify(personTwo, Mockito.never()).receive(defaultNotification);
    }

}