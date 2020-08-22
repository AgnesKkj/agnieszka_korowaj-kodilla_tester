package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {

        OperatingSystem systemOne = new OperatingSystem(2005);
        System.out.println("Rok wydania: " + systemOne.getReleaseYear());
        System.out.println("Uruchamianie systemu...");
        systemOne.turnOn();
        System.out.println("Czy jest uruchomiony? " + systemOne.getTurnOn());
        System.out.println("Wyłączanie systemu...");
        systemOne.turnOff();
        System.out.println("Czy jest uruchomiony? " + systemOne.getTurnOn());

    }
}
