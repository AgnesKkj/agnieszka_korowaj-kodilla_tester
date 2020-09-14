package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    //kolekcja zamówień
    private static Set<Order> orderList = new HashSet<>();

    public static Order addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order " + order + " added.");
        return order;
    }

    public static void getOrder(String number) {
        System.out.println("Searching for order No. " + number);
        orderList
                .stream()
                .filter(un -> un.getNumber().equals(number))
                .forEach(um -> System.out.println("Found order: " + um));

        try {
            throw new OrderDoesntExistException();
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found.");
        } finally {
            System.out.println(orderList);
        }
    }
}
