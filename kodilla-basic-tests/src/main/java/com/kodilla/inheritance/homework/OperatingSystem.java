package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    public boolean turnOn;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    };

    public void turnOn() {
        if(turnOn == true) {
            return;
        }
        turnOn = true;
        System.out.println("System włączony.");
    }

    public void turnOff() {
        if(turnOn == false) {
            return;
        }
        turnOn = false;
        System.out.println("System wyłączony.");
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public boolean getTurnOn() {
        return this.turnOn;
    }
}
