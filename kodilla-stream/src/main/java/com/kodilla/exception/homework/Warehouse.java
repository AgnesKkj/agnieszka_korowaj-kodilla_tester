package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Warehouse {
    //kolekcja zamówień
    private static Set<Order> orderList = new HashSet<>();
    private static Order order;

    public static Set<Order> addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order " + order + " added.");
        return orderList;
    }

    public static void getOrder(String number) {
        System.out.println("Searching for order No. " + number);
        orderList
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .forEach(un -> System.out.println("Found order: " + un));

        orderList
                .stream()
                .filter(u -> u.getNumber().equals(null));
        try {
            throw new OrderDoesntExistException();
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found.");
        }
        finally {
            System.out.println(orderList);
        }
    }
}
