package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> studentsList = new ArrayList<>();


    public School(String schoolName, Integer... studentsList) {
        this.schoolName = schoolName;
        for (Integer learner : studentsList)
            this.studentsList.add(learner);
    }

    public int getLearnerNumber() {
        int sum = 0;
        for (int learner : studentsList)
            sum += learner;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {

        return "students list " + studentsList.toString();
    }

}
