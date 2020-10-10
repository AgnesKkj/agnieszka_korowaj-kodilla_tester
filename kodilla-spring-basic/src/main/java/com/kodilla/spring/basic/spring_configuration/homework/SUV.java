package com.kodilla.spring.basic.spring_configuration.homework;

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
        return this.hasHeadlightsOn();
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

}
