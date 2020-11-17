package com.kodilla.exception.homework;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTestSuite {
    Set<Order> orderList = new HashSet<>();

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //when
        Warehouse.addOrder(new Order("2"));
        Warehouse.getOrder("2");
        //then
        Order expectedOrder = new Order("2");
        assertEquals(expectedOrder.getNumber(), Warehouse.getOrder("2").getNumber());
    }

    @Test (expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        //when
        Warehouse.addOrder(new Order("2"));
        Warehouse.getOrder("3");
        //then
        Order expectedOrder = null;
        assertNotEquals(expectedOrder.getNumber(), Warehouse.getOrder("2").getNumber());
        assertThrows(OrderDoesntExistException.class, () -> {
                    Integer.parseInt("One");                }
                );
    }
}