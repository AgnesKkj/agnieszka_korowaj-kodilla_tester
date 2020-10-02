package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliverPriority implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivery of a priority package in progress...");
        return true;
    }
}
