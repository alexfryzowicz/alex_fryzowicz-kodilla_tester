package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class WarehouseTestSuite {
    Warehouse warehouse = new Warehouse();

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        warehouse.addOrder("2");
        Order myOrder = warehouse.getOrder("2");
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        warehouse.addOrder("7");
        Order myOrder = warehouse.getOrder("7jkk");
        assertNull(myOrder);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void getOrderTest_withException() throws Exception {
        warehouse.addOrder("44");
        warehouse.addOrder("33");
        warehouse.addOrder("55");
        warehouse.addOrder("45");
        Order order = warehouse.getOrder("4");
        assertNull(order);
    }
}