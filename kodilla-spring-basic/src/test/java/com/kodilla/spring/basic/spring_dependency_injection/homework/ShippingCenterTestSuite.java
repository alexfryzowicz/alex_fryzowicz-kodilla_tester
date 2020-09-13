package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean info = bean.deliverPackage("New York, Wall Street 9", 30);
        Assertions.assertTrue(info);
    }

    @Test
    public void shouldReturnFalse() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean info = bean.deliverPackage("New York, Wall Street 9", 35);
        Assertions.assertFalse(info);
    }

    @Test
    public void shouldReturnIfSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.success("New York, Wall Street 9");
        Assertions.assertEquals("Package delivered to: New York, Wall Street 9", address);
    }

    @Test
    public void shouldReturnIfFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String address = bean.fail("New York, Wall Street 9");
        Assertions.assertEquals("Package not delivered to: New York, Wall Street 9", address);
    }
}