package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        //schools = new HashMap<>();

        Principal john = new Principal("John");
        Principal bob = new Principal("Bob");
        Principal jack = new Principal("Jack");

        School johnSchool = new School("University of California", 25.0, 35.0, 20.0);
        School bobSchool = new School("Stanford University", 20.0, 25.0);
        School jackSchool = new School("Harvard University", 15.0, 15.0, 15.0);

        schools.put(john, johnSchool);
        schools.put(bob, bobSchool);
        schools.put(jack, jackSchool);

        for (Map.Entry<Principal, School> schoolsEntry : schools.entrySet()) {
            System.out.println(schoolsEntry.getKey().getName() + " is Director of " + schoolsEntry.getValue().getSchoolName() + " with the total number of students " + schoolsEntry.getValue().getLearnerNumber());
        }
    }
}
