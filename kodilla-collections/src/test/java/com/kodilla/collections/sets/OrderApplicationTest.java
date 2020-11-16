package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderApplicationTest {

    Set<Order> orders = new HashSet<>();
    Order orderOne = new Order("11/2020", "Chair", 2);

    @Test
    public void addsOrder() {
        orders.add(orderOne);
        assertEquals(1,orders.size());
    }


}