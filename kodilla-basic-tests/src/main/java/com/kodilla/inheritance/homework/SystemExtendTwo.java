package com.kodilla.inheritance.homework;

public class SystemExtendTwo extends OperatingSystem {

    public SystemExtendTwo(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        if(turnOn == true) {
            return;
        }
        //nadpisanie
        turnOn = true;

    }

    @Override
    public void turnOff() {
        if(turnOn == false) {
            return;
        }
        //nadpisanie
        turnOn = false;
    }



}
