package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    boolean hasHeadlightsTurnedOn = false;

    @Override
    public boolean hasHeadlightsOn() {
        return hasHeadlightsTurnedOn;
    }

    public void turnLightsOn() {
        this.hasHeadlightsTurnedOn = true;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

}
