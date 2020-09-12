package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        //przez streama stworzyć listę dat zadań, których deadline nie upłynął
        List<LocalDate> undoneTasks = new ArrayList<>();
        TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getDeadline)
                .collect(Collectors.toList())
                .forEach(un -> System.out.println("Uncompleted task deadline: " + un));
    }
}
