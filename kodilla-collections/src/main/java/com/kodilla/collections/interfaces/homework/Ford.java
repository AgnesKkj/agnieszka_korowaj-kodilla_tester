package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {

    double speed;
    private double acceleration;
    private double brakes;

    public Ford(double speed, double acceleration, double brakes) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return Double.compare(ford.speed, speed) == 0 &&
                Double.compare(ford.acceleration, acceleration) == 0 &&
                Double.compare(ford.brakes, brakes) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration, brakes);
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", brakes=" + brakes +
                '}';
    }
}
