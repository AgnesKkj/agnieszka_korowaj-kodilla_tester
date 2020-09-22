package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double value;
    private LocalDate orderDate;
    private String whoOrdered;

    public Order(double value, LocalDate orderDate, String whoOrdered) {
        this.value = value;
        this.orderDate = orderDate;
        this.whoOrdered = whoOrdered;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getWhoOrdered() {
        return whoOrdered;
    }

    public void setWhoOrdered(String anon) {
        this.whoOrdered = anon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.getValue(), getValue()) == 0 &&
                getOrderDate().equals(order.getOrderDate()) &&
                getWhoOrdered().equals(order.getWhoOrdered());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getOrderDate(), getWhoOrdered());
    }

    @Override
    public String toString() {
        return "Order: value " + value + ", made " + orderDate + " by " + whoOrdered;
    }


}
