package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
            cars[n].increaseSpeed();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        //rand speed
        double a = random.nextDouble() * 10 + 1;
        //rand acceleration
        double b = random.nextDouble() * 10 + 1;
        //rand brakes
        double c = random.nextDouble() * 10 + 1;

        if (drawnCarKind == 0) {
            return new Ford(a,b,c);
        }
        else if (drawnCarKind == 1) {
            return new Opel(a,b,c);
        }
        else {
            return new Peugeot(a,b,c);
        }
    }



}
