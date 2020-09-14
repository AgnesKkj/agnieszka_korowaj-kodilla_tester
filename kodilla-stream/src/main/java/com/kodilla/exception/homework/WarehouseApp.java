package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("4"));

        Warehouse.getOrder("2");
        Warehouse.getOrder("3");
        Warehouse.getOrder("5");
    }
}
