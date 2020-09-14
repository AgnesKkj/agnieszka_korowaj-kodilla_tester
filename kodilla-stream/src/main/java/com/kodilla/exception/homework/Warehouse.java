package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    //kolekcja zamówień
    private static Set<Order> orderList = new HashSet<>();
    private static Order order;

    public static Order addOrder(Order order) {
        orderList.add(order);
        System.out.println("Order " + order + " added.");
        return order;
    }

    public static boolean isInTheWarehouse(String order) throws OrderDoesntExistException {
        if(orderList.contains(order)) {
            return true;
        }
        throw new OrderDoesntExistException();
    }

    public static void getOrder(String number) {
        System.out.println("Searching for order No. " + number);
        orderList
                .stream()
                .filter(un -> un.getNumber().equals(number))
                .forEach(um -> System.out.println("Found order: " + um));
    }
}
