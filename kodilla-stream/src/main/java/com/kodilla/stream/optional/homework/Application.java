package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bart Simpson", new Teacher("Seymour Skinner")));
        studentList.add(new Student("Tom Sawyer", null));
        studentList.add(new Student("Harry Potter", new Teacher("Minerva McGonnagall")));
        studentList.add(new Student("Robinson Crusoe", null));

        for(Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + ", teacher: " + teacherName);
        }
    }
}
