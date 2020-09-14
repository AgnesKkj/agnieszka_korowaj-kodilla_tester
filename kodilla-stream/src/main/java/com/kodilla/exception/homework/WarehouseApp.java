package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Order orderOne = new Order("1");
        Order orderTwo = new Order("2");
        Order orderFour = new Order("4");
        Warehouse.addOrder(orderOne);
        Warehouse.addOrder(orderTwo);
        Warehouse.addOrder(orderFour);

        Warehouse.getOrder("2");
        Warehouse.getOrder("3");
        Warehouse.getOrder("5");
    }
}
