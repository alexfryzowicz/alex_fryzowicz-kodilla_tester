package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    //przech.kolekcję zamówień
    private  static List<Order> listOfOrders = new ArrayList<>();

    //dodaje zamówienie do kolekcji
    public void addOrder(String orderNumber) {
        Order order = new Order(orderNumber);
        listOfOrders.add(order);
    }
    //szuka w kolekcji zamówienie o podanym nr
    public Order getOrder(String number) throws OrderDoesntExistException {
        return listOfOrders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
    }

    public static Order getOrderNumber(Order order) {
        for(Order yourOrderNumber : listOfOrders) {
            if(yourOrderNumber.getNumber().equals(order.getNumber()))
                return yourOrderNumber;
        }
        return null;
    }
}