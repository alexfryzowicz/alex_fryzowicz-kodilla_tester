package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("zadanie nr 1: ", LocalDate.of(2020, 9, 01), LocalDate.of(2020, 8, 3)));
        tasks.add(new Task("zadanie nr 2: ", LocalDate.of(2020,10,01), LocalDate.of(2020,10,3)));
        tasks.add(new Task("zadanie nr 3: ", LocalDate.of(2020,11,01), LocalDate.of(2020,11,03)));
        tasks.add(new Task("zadanie nr 4: ", LocalDate.of(2020,12,01), LocalDate.of(2020,12,03)));
        return tasks;
    }
}
