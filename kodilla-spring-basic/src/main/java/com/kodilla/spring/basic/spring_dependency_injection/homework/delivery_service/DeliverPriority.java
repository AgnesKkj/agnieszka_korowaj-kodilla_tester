package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery_service;

import org.springframework.stereotype.Component;

@Component
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
