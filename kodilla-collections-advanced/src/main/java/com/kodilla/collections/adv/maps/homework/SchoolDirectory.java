package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> allSchools = new HashMap<>();

        Principal reginald = new Principal("Reginald", "Hargreeves");
        Principal albus = new Principal("Albus", "Dumbledore");
        Principal seymour = new Principal("Seymour", "Skinner");

        School reginaldUmbrella = new School("Umbrella Academy",1,1,1,1,1,1,1);
        School albusHogwarts = new School("Hogwarts",140,125,92,82,108,115,96);
        School seymourSpringfield = new School("Springfield Elementary",25,30,28,22,32,27,29);

        allSchools.put(reginald, reginaldUmbrella);
        allSchools.put(albus, albusHogwarts);
        allSchools.put(seymour,seymourSpringfield);

        for(Map.Entry<Principal, School> principalEntry : allSchools.entrySet()) {
            System.out.println("Total students in " + principalEntry.getKey().getName() + " " + principalEntry.getKey().getSurname() + "'s school " + principalEntry.getValue().getSchoolName() + ": " +  principalEntry.getValue().getSum());
        }

    }
}
