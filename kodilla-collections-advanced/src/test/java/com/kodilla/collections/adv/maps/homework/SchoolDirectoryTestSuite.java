package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SchoolDirectoryTestSuite {

    Map<Principal, School> allSchools = new HashMap<>();

    Principal reginald = new Principal("Reginald", "Hargreeves");
    Principal albus = new Principal("Albus", "Dumbledore");
    Principal seymour = new Principal("Seymour", "Skinner");

    School reginaldUmbrella = new School("Umbrella Academy",1,1,1,1,1,1,1);
    School albusHogwarts = new School("Hogwarts",140,125,92,82,108,115,96);
    School seymourSpringfield = new School("Springfield Elementary",25,30,28,22,32,27,29);

    @Test
    public void testPutToMap() {
        allSchools.put(reginald, reginaldUmbrella);
        allSchools.put(albus, albusHogwarts);
        allSchools.put(seymour,seymourSpringfield);
        assertEquals(3,allSchools.size());
    }

    @Test
    public void getsRightValueForKey() {
        allSchools.put(reginald, reginaldUmbrella);
        allSchools.put(albus, albusHogwarts);
        School expectedSchool = new School("Umbrella Academy",1,1,1,1,1,1,1);
        School unexpectedSchool = new School("Hogwarts",140,125,92,82,108,115,96);
        assertEquals(expectedSchool.getSum(), allSchools.get(reginald).getSum());
        assertNotEquals(unexpectedSchool.getSum(),allSchools.get(reginald).getSum());
    }

}