package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Take out laundry", LocalDate.of(2020, 9, 06), LocalDate.of(2020, 9, 12)));
        taskList.add(new Task("Clean the PC", LocalDate.of(2020,9,13), LocalDate.of(2020,9,20)));
        taskList.add(new Task("Buy groceries", LocalDate.of(2020,9,14), LocalDate.of(2020,9,15)));
        return taskList;
    }
}


