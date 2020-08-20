package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.VW;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("---------------------");
        System.out.println("car: " + getCarName(car));
        System.out.println("speed " + car.increaseSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof VW)
            return "VW";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "no car detected";
    }
}
