package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Kraków Mariacki",3,2,false));
        stamps.add(new Stamp("Stratford Globe",5,4,true));
        stamps.add(new Stamp("Queen Elizabeth II",3,2,true));
        stamps.add(new Stamp("Stratford Globe",5,4,true));
        stamps.add(new Stamp("Queen Elizabeth II",3,2,true));

        System.out.println("Set size: " + stamps.size());
        for(Stamp stamp: stamps) {
            System.out.println("Added to collection: " +stamp);
        }
    }
}
