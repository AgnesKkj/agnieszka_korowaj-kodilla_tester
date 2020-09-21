package com.kodilla.mockito.homework;

public interface Localization {

    WeatherNotification defaultNotification = new WeatherNotification("Make sure to read our Terms of Service.");

    void addSubscriber(Person person);
    void sendLocOneNotification(WeatherNotification locOneWeatherNotification);
    void sendLocTwoNotification(WeatherNotification locTwoWeatherNotification);
    void sendLocThreeNotification(WeatherNotification locThreeWeatherNotification);

    static void sendDefaultNotification(WeatherNotification defaultNotification) {
        for (Person person : LocalizationOne.locOneSubscribers) {
            person.receive(defaultNotification);
        }
        for (Person person : LocalizationTwo.locTwoSubscribers) {
            person.receive(defaultNotification);
        }
        for (Person person : LocalizationThree.locThreeSubscribers) {
            person.receive(defaultNotification);
        }

    }
    void removeSubscriber(Person person);
    void emptyLocalization();

}
