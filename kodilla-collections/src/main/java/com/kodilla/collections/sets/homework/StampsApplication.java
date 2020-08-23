package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp ("vintage", "4cm/4cm", true));
        stamps.add(new Stamp("newest", "5cm/5cm", true));
        stamps.add(new Stamp("black and white", "10cm/12cm", false));
        stamps.add(new Stamp("vintage", "10cm/12cm", false));
        stamps.add(new Stamp("black and white", "10cm/12cm", false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
