package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(5,5,5);
        doRace(ford);

        Opel opel = new Opel(5,3,4);
        doRace(opel);

        Peugeot peugeot = new Peugeot(5,6,4);
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
