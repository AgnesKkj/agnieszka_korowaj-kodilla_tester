package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {

    double speed;
    private double acceleration;
    private double brakes;

    public Opel(double speed, double acceleration, double brakes) {
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
        Opel opel = (Opel) o;
        return Double.compare(opel.speed, speed) == 0 &&
                Double.compare(opel.acceleration, acceleration) == 0 &&
                Double.compare(opel.brakes, brakes) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration, brakes);
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", brakes=" + brakes +
                '}';
    }
}
