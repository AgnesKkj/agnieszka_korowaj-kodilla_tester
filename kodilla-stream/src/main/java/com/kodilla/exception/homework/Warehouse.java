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

    public static Order getOrder(String number) throws OrderDoesntExistException {
        System.out.println("Searching for order No. " + number);
        return orderList
                .stream()
                .filter(un -> un.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}

