package com.kodilla.spring.basic.spring_configuration.homework;
import com.kodilla.spring.basic.spring_configuration.homework.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldChooseTheCarForCurrentSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("dependingOnSeason");
        String carType = car.getCarType();
        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldCheckIfHasHeadlightsTurnedOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("dependingOnSeason");
        boolean headlightsStatus = car.hasHeadlightsTurnedOn();
        Assertions.assertTrue(headlightsStatus);
    }
}