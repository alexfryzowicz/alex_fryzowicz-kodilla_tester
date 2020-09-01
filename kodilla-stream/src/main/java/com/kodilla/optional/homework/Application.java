package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", new Teacher("Noah")));
        students.add(new Student("Emma", new Teacher("John")));
        students.add(new Student("Matthew", new Teacher("George")));
        students.add(new Student("Leo", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("student " + student.getName() + " is taught by teacher " + teacherName.getName());
        }
    }
}
