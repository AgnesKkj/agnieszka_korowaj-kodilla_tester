package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Random;

public class SUV implements Car {

    private boolean hasHeadlightsTurnedOn;

    @Override
    public boolean hasHeadlightsOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public void turnLights(int hour) {
        if(hour < 6 && hour >= 20) {
            this.hasHeadlightsTurnedOn = true;
        }
        this.hasHeadlightsTurnedOn = false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

}
