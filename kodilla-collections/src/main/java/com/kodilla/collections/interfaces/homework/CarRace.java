package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford();
        doRace(ford);

        Opel opel = new Opel();
        doRace(opel);

        Peugeot peugeot = new Peugeot();
        doRace(peugeot);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        System.out.println(car.getSpeed());

    }
}
