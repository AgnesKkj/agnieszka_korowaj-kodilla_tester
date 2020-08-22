package com.kodilla.inheritance.homework;

public class SystemExtendOne extends OperatingSystem {

    public SystemExtendOne(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        if(turnOn == true) {
            return;
        }
        //nadpisanie
        turnOn = true;
        System.out.println("System uruchomiony.");

    }

    @Override
    public void turnOff() {
        if(turnOn == false) {
            return;
        }
        //nadpisanie
        turnOn = false;
        System.out.println("System zamknięty.");
    }


}
