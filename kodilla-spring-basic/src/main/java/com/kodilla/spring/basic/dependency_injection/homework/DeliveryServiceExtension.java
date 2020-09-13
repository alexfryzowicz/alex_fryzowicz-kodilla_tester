package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryServiceExtension implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("package too heavy");
            return false;
        }
        System.out.println("delivering in progress...");
        return true;
    }
}