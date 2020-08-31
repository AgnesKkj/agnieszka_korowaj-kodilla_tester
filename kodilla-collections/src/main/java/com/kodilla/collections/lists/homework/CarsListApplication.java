package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        Ford fordOne = new Ford(5,1.2,0.9);
        Ford fordTwo = new Ford(4.5,1.1,0.8);
        Ford fordThree = new Ford(4.7,1.2,1.1);
        cars.add(0,fordOne);
        cars.add(1,fordTwo);
        cars.add(2,fordThree);

        for(Ford ford : cars) {
            CarUtils.describeCar(ford);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji: " + cars.size());

        cars.remove(1);
        System.out.println(" ");
        System.out.println("-------");
        System.out.println(" ");
        System.out.println("Po usunięciu 2. pozycji:");
        for(Car ford : cars) {
            CarUtils.describeCar(ford);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji: " + cars.size());

        cars.remove(fordThree);
        System.out.println(" ");
        System.out.println("-------");
        System.out.println(" ");
        System.out.println("Po usunięciu obiektu fordThree:");
        for(Car ford : cars) {
            CarUtils.describeCar(ford);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji: " + cars.size());
    }
}
