package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {

        OperatingSystem systemZero = new OperatingSystem(2005);
        System.out.println("Rok wydania: " + systemZero.getReleaseYear());
        System.out.println("Uruchamianie systemu...");
        systemZero.turnOn();
        System.out.println("Zamykanie systemu...");
        systemZero.turnOff();

        SystemExtendOne systemOne = new SystemExtendOne(2010);
        System.out.println("Rok wydania: " + systemOne.getReleaseYear());
        System.out.println("Uruchamianie systemu...");
        systemOne.turnOn();
        System.out.println("Zamykanie systemu...");
        systemOne.turnOff();

        SystemExtendTwo systemTwo = new SystemExtendTwo(2015);
        System.out.println("Rok wydania: " + systemTwo.getReleaseYear());
        System.out.println("Uruchamianie systemu...");
        systemTwo.turnOn();
        System.out.println("Zamykanie systemu...");
        systemTwo.turnOff();

    }
}
