package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Double> schools = new ArrayList<>();


    public School(String schoolName, double... schools) {
        this.schoolName = schoolName;
        for (double learner : schools)

            this.schools.add(learner);
    }

    public double getLearnerNumber() {
        double sum = 0;
        for (double learner : schools)
            sum += learner;
        return sum++;
    }

    public String getSchoolName() {

        return schoolName;
    }

    @Override
    public String toString() {

        return "schools" + schools.toString();
    }

}
