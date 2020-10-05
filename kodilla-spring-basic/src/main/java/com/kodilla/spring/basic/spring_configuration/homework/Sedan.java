package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Random;

public class Sedan implements Car {

    boolean hasHeadlightsTurnedOn = false;

    @Override
    public boolean hasHeadlightsOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public void turnLights(String onOff) {
        if(onOff == "off") {
            this.hasHeadlightsTurnedOn = false;
        }
        else if(onOff == "on") {
            this.hasHeadlightsTurnedOn = true;
        }
        else {
            System.out.println("Error. Enter 'on' or 'off' as argument when calling method.");
        }
    }

    @Override
    public boolean turnLightsDependingOnHour() {
        Random generator = new Random();
        int hour = generator.nextInt(24);
        System.out.println("Hour: " + hour);
        if(hour < 6 || hour >= 20) {
            this.hasHeadlightsTurnedOn = true;
        }
        else {
            this.hasHeadlightsTurnedOn = false;
        }
        System.out.println("Headlights depending on hour: " + this.hasHeadlightsOn());
        return this.hasHeadlightsOn();
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
