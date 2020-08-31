package com.kodilla.collections.interfaces.homework;

public class Peugeot implements Car {

    double speed;
    private double acceleration;
    private double brakes;

    public Peugeot(double speed, double acceleration, double brakes) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.brakes = brakes;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void increaseSpeed() {
        speed*=acceleration;
    }

    public void decreaseSpeed() {
        speed*=brakes;
    }

    @Override
    public String toString() {
        return "Peugeot{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", brakes=" + brakes +
                '}';
    }
}
