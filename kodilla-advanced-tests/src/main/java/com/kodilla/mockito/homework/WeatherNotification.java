package com.kodilla.mockito.homework;

public class WeatherNotification {
    String content;

    public WeatherNotification(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Alert: " + content;
    }
}
