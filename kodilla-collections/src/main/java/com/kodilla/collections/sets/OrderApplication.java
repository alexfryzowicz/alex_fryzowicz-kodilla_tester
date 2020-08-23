package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2019", "iron", 1.0));
        orders.add(new Order("2/2019", "cutlery", 6.0));
        orders.add(new Order("3/2019", "chair", 2.0));
        orders.add(new Order("1/2019", "iron", 1.0));

        System.out.println(orders.size());
        for (Order order : orders)
            System.out.println(order);
    }
}
