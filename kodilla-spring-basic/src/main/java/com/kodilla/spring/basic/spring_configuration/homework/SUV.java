package com.kodilla.spring.basic.spring_configuration.homework;


import java.util.Random;

public class SUV implements Car {

    private boolean hasHeadlightsTurnedOn;

    @Override
    public boolean hasHeadlightsOn() {
        return hasHeadlightsTurnedOn;
    }

    @Override
    public void turnLights(String onOff) {
        if(onOff == "off") {
            hasHeadlightsTurnedOn = false;
        }
        else if(onOff == "on") {
            hasHeadlightsTurnedOn = true;
        }
        else {
            System.out.println("Error. Enter 'on' or 'off' as argument when calling method.");
        }
    }

    @Override
    public boolean turnLightsDependingOnHour() {
        Random generator = new Random();
        int hour = generator.nextInt(24);
        if(hour < 6 || hour >= 20) {
            hasHeadlightsTurnedOn = true;
        }
        else {
            hasHeadlightsTurnedOn = false;
        }
        System.out.println("Hour: " + hour);
        return this.hasHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

}
