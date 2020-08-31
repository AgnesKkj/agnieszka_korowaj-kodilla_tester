package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Peugeot;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(5,1.2,0.9));
        cars.add(new Ford(4.5,1.1,0.8));
        cars.add(new Ford(4.7,1.2,1.1));
        cars.add(new Opel(4.8,1.3,1.1));
        cars.add(new Opel(4.6,1,0.8));
        cars.add(new Peugeot(4.9,1.3,0.9));
        cars.add(new Peugeot(4.7,1.2,0.7));


        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji: " + cars.size());

        cars.remove(5);
        System.out.println(" ");
        System.out.println("-------");
        System.out.println(" ");
        System.out.println("Po usunięciu 6. pozycji:");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji: " + cars.size());

        cars.remove(new Ford(4.7,1.2,1.1));
        System.out.println(" ");
        System.out.println("-------");
        System.out.println(" ");
        System.out.println("Po usunięciu obiektu new Ford(4.7,1.2,1.1):");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println(" ");
        System.out.println("Rozmiar kolekcji: " + cars.size());
    }
}
