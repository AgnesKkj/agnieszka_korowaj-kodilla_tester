package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orderList = new HashSet<>();

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

    public List<Order> getOrdersByDateRange(LocalDate dateFrom, LocalDate dateTo) {
        if(dateFrom.isAfter(dateTo)) {
            System.out.println("Wrong date range. The date from must be before the date to.");
            return null;
        }
        else if(dateFrom.isAfter(LocalDate.now()) || dateTo.isAfter(LocalDate.now())) {
            System.out.println("Wrong date range. Please provide dates up to the present date.");
            return null;
        }
        System.out.println("Searching for orders by date from " + dateFrom + " to " + dateTo + "...");
        List<Order> ordersByDate = orderList
                .stream()
                .filter(u -> u.getOrderDate().isAfter(dateFrom.minusDays(1)))
                .filter(un -> un.getOrderDate().isBefore(dateTo.plusDays(1)))
                .collect(Collectors.toList());
        if (ordersByDate.isEmpty()) {
            System.out.println("No orders in given date range.");
            return null;
        }
        System.out.println(ordersByDate);
        return ordersByDate;
    }

    public List<Order> getOrdersByMinMaxValue(double minValue, double maxValue) {
        if(minValue > maxValue) {
            System.out.println("Wrong value range. The minimal value must be smaller than the maximal value.");
            return null;
        }
        else if (minValue < 0 || maxValue < 0) {
            System.out.println("Wrong value range. Given values cannot be negative.");
            return null;
        }
        System.out.println("Searching orders by value from " + minValue + " to " + maxValue + "...");
        List<Order> ordersByValue = orderList
                .stream()
                .filter(u -> u.getValue() >= minValue)
                .filter(un -> un.getValue() <= maxValue)
                .collect(Collectors.toList());
        if (ordersByValue.isEmpty()) {
            System.out.println("No orders in given value range.");
            return null;
        }
        System.out.println(ordersByValue);
        return ordersByValue;
    }

    public double sumOrders() {
        if (orderList.size() == 0) {
            System.out.println("No orders to sum up.");
            return 0;
        }
        double sum = 0;
        for (Order order : this.orderList) {
            sum += order.getValue();
        }
        System.out.println("Order value total:  " + sum);
        return sum;
    }

    public int getSize() {
        System.out.println("Order list size: " + orderList.size());
        return orderList.size();
    }

    public void clear() {
        System.out.println("Order list cleared!");
        orderList.clear();
    }

}
