package com.kodilla.exception.homework;
public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("4"));

        Warehouse.getOrder("2");


        try {
            Warehouse.getOrder("3");
            throw new OrderDoesntExistException();
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found.");
        }

    }
}