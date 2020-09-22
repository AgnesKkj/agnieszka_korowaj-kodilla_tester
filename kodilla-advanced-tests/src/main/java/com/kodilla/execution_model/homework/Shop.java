package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orderList = new HashSet<>();
    private List<Order> filteredOrders = new ArrayList<>();

    public void addOrder(Order order) {
        System.out.println(order);
        if (order.getWhoOrdered().equals("")) {
            order.setWhoOrdered("Anonymous");
        } else if (order.getValue() < 0.0 || order.getValue() == 0.0) {
            System.out.println("Wrong order format. Value cannot be 0.0 or negative");
            return;
        } else if (order.getOrderDate().isAfter(LocalDate.now())) {
            System.out.println("Wrong order format. Date can't be after today.");
            return;
        }
        orderList.add(order);
    }

    public List<Order> filterOrdersByDate() {
        filteredOrders = orderList
                .stream()
                .filter(u -> u.getOrderDate().isAfter(LocalDate.now().minusDays(2)))
                .collect(Collectors.toList());
        System.out.println(filteredOrders);
        for(Order order : orderList) {
            if (filteredOrders.contains(order)) {
                return filteredOrders;
            }
            System.out.println("No orders in the requested date range.");
        } return null;
    }

    public double returnsMinValueOfFilteredOrders() {
        if (filteredOrders.isEmpty()) {
            System.out.println("No records to filter.");
            return 0;
        }
        Order minOrder = Collections.min(filteredOrders, Comparator.comparing(n -> n.getValue()));
        System.out.println("Smallest order value filtered: " + minOrder.getValue());
        return minOrder.getValue();
    }

    public double returnsMaxValueOfFilteredOrders() {
        if (filteredOrders.isEmpty()) {
            System.out.println("No records to filter.");
            return 0;
        }
        Order maxOrder = Collections.max(filteredOrders, Comparator.comparing(n -> n.getValue()));
        System.out.println("Greatest order value filtered: " + maxOrder.getValue());
        return maxOrder.getValue();
    }

    public int getSize() {
        System.out.println("Order list size: " + orderList.size());
        return orderList.size();
    }

    public void clear() {
        System.out.println("Order list cleared!");
        orderList.clear();
    }

    public double sumOrders() {
        if (orderList.size() != 0) {

            double sum = 0;
            for (Order order : this.orderList) {
                sum += order.getValue();
            }
            System.out.println("Order value total:  " + sum);
            return sum;
        }
        System.out.println("No orders to sum up.");
        return 0;
    }


    //zwrócenie listy z zakresu dwóch dat
    //pobranie listy na podstawie przekazanego zakresu
    //zwrócenie liczby zamówień
    //suma wartości wszystkich zamówień

    
    //zakres dwóch dat - dwie daty wstecz od now, jeśli można je odnaleźć?


}
