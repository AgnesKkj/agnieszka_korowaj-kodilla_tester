package com.kodilla.collections.adv.maps.complex;


import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        //stwarzamy obiekty klasy Student
        Student john = new Student("John", "Stevenson");
        Student jesse = new Student("Jesse", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        //stwarzamy listy klasy Grades
        Grades johnGrades = new Grades(5.0, 4.5 ,4.0, 4.0, 5.0);
        Grades jesseGrades = new Grades(2.5, 3.0, 2.0);
        Grades bartGrades = new Grades(4.0, 3.0, 3.5, 4.0, 4.5);

        //"składamy" mapę z kluczy-obiektów i wartości z listy
        school.put(john, johnGrades);
        school.put(jesse, jesseGrades);
        school.put(bart, bartGrades);

        System.out.println(john.getName() + "'s " + school.get(john));

        for(Map.Entry<Student, Grades> studentEntry : school.entrySet()) {
            System.out.println(studentEntry.getKey().getName() + "'s average: " + studentEntry.getValue().getAverage());
        }
    }
}
