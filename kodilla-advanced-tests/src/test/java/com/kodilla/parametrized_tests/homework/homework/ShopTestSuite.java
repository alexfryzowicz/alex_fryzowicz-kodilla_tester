package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ShopTestSuite {

    Shop shoppingList = new Shop();
    Order order1 = new Order(55, LocalDate.of(2020, 1, 1), "bill");
    Order order2 = new Order(555, LocalDate.of(2020, 2, 2), "johny");
    Order order3 = new Order(33, LocalDate.of(2020, 3, 3), "marie");
    Order order4 = new Order(44, LocalDate.of(2020, 4, 4), "eliot");

    @Test
    public void theListSizeShouldChangeAfterAddingOrder() {
        //When
        int numberOfOrders = shoppingList.returnNumberOfOrders();
        //Then
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldReturnOrderByIndex() {
        //When
        Order getIndex2 = shoppingList.getOrder(2);
        //Then
        assertEquals(33, getIndex2.getOrderValue(), 0.01);
        assertEquals(LocalDate.of(2020, 3, 3), getIndex2.getDate());
        assertEquals("marie", getIndex2.getLogin());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 555})
    public void shouldReturnNullWhenPassingANonExistentIndex (int indexNumber) {
        Order result = shoppingList.getOrder(indexNumber);
        assertNull(result);
    }

    @Test //lista zamówień z dwóch dat
    public void shouldReturnOrdersFromTwoDates() {
        //When
        LocalDate date1 = LocalDate.of(2020, 2, 2);
        LocalDate date2 = LocalDate.of(2020, 3, 3);

        List<Order> ordersFromTwoDates = shoppingList.returnListOfOrdersByDate(date1, date2);

        int ordersFromTwoDatesSize = ordersFromTwoDates.size();
        if (ordersFromTwoDatesSize > 0) {
            System.out.println("orders: " + ordersFromTwoDatesSize + " placed on: " + ordersFromTwoDates);
        } else
            System.out.println("no orders at this time");

        //Then
        assertEquals(0, ordersFromTwoDatesSize);
    }

    @Test //najmniejsza i największa wartość zamówienia
    public void shouldReturnOrdersBasedOnOrderValues() {
        //When
        double orderValue1 = 55;
        double orderValue2 = 555;

        List<Order> returnOrderByOrderValue = shoppingList.returnOrderByOrderValue(orderValue1, orderValue2);

        int ordersByTwoValuesSize = returnOrderByOrderValue.size();
        if (ordersByTwoValuesSize > 0) {
            System.out.println("orders: " + ordersByTwoValuesSize + " with values: " + returnOrderByOrderValue);
        } else
            System.out.println("no orders with given value");

        //Then
        assertEquals(0, ordersByTwoValuesSize);
    }

    @Test //zwrócenie liczby zamówień
    public void shouldReturnNumberOfOrders() {
        int numberOfOrders = shoppingList.returnNumberOfOrders();
        System.out.println("The number of orders is " + numberOfOrders);
        assertEquals(4, numberOfOrders);
    }

    @Test //suma wszystkich zamówień
    public void shouldSumAllOrdersValues() {
        double allOrdersValues = shoppingList.sumAllOrdersValue();
        System.out.println("total orders: " + allOrdersValues);
        assertEquals(687, allOrdersValues);
    }

    @BeforeEach
    public void addAllOrders() {
        shoppingList.addOrder(order1);
        shoppingList.addOrder(order2);
        shoppingList.addOrder(order3);
        shoppingList.addOrder(order4);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values");
    }

    @BeforeAll
    public static void initializeTests() {
        System.out.println("Starting tests");
    }

    @AfterAll
    public static void displayGoodbyeMessage() {
        System.out.println("Finishing testing");
    }
}