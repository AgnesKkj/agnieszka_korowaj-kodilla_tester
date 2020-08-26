package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    int speed;
    private double acceleration;
    private double brakes;

    public Peugeot() {
        this.speed = 5;
        this.acceleration = 1.74;
        this.brakes = 0.76;
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
