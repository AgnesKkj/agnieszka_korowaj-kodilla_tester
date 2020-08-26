package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    int speed;
    private double acceleration;
    private double brakes;

    public Ford() {
        this.speed = 5;
        this.acceleration = 1.76;
        this.brakes = 0.89;
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
