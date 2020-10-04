package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    boolean hasHeadlightsTurnedOn = false;

    @Override
    public boolean hasHeadlightsOn() {
        boolean hasHeadlightsTurnedOn = false;
        return hasHeadlightsTurnedOn;
    }

    public void turnLightsOn() {
        this.hasHeadlightsTurnedOn = true;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
