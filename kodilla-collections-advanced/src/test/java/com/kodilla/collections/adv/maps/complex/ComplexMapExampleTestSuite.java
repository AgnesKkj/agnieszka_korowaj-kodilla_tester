package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ComplexMapExampleTestSuite {

    Map<Student, Grades> school = new HashMap<>();

    Student john = new Student("John", "Stevenson");
    Student jesse = new Student("Jesse", "Pinkman");
    Student bart = new Student("Bart", "Simpson");
    Grades johnGrades = new Grades(5.0, 4.5 ,4.0, 4.0, 5.0);
    Grades jesseGrades = new Grades(2.5, 3.0, 2.0);
    Grades bartGrades = new Grades(4.0, 3.0, 3.5, 4.0, 4.5);

    @Test
    public void testPutToMap() {
        school.put(john, johnGrades);
        school.put(jesse,jesseGrades);
        school.put(bart,bartGrades);
        assertEquals(3,school.size());
    }

    @Test
    public void getsRightValueForKey() {
        school.put(john, johnGrades);
        school.put(jesse,jesseGrades);
        Grades expectedGrades = new Grades(5.0, 4.5 ,4.0, 4.0, 5.0);
        Grades unexpectedGrades = new Grades(2.5, 3.0, 2.0);
        assertEquals(expectedGrades.getAverage(),school.get(john).getAverage());
        assertNotEquals(unexpectedGrades.getAverage(),school.get(john).getAverage());
    }

}