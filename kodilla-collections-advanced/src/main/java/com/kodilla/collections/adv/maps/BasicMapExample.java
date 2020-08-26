package com.kodilla.collections.adv.maps;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("math", 5.0);
        grades.put("physics", 4.5);
        grades.put("philosophy", 4.0);

        Double grade = grades.get("math");
        System.out.println(grade);

        for (Map.Entry<String, Double> note : grades.entrySet()) {
            System.out.println("grade of " + note.getKey() + " is equal to " + note.getValue());
        }


    }
}
