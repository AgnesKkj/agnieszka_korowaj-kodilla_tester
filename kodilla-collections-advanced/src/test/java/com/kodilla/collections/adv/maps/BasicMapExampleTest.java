package com.kodilla.collections.adv.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasicMapExampleTest {

    Map<String,Double> grades = new HashMap<>();

    @Test
    public void testPutToMap() {
        grades.put("IT", 4.5);
        assertEquals(1, grades.size());
    }

    @Test
    public void getsTheRightValueForKey() {
        grades.put("IT", 4.5);
        double expectedValue = 4.5;
        grades.get("IT");
        assertEquals(java.util.Optional.of(expectedValue), java.util.Optional.of(grades.get("IT")));
    }


}