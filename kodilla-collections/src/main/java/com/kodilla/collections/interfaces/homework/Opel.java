package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    int speed;
    private double acceleration;
    private double brakes;

    public Opel() {
        this.speed = 5;
        this.acceleration = 1.24;
        this.brakes = 0.96;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed*=acceleration;
    }

    public void decreaseSpeed() {
        speed*=brakes;
    }
}
