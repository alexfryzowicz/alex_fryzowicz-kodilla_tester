package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder("1");
        warehouse.addOrder("2");
        warehouse.addOrder("3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("number of your order");
        String order = scanner.nextLine();
        try {
            Order orderNumber = warehouse.getOrder(order);
            System.out.println("order number: " + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("wrong number");
        }
    }
}