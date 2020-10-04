package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery_service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DeliverStandard implements DeliveryService {


    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Standard delivery in progress...");
        return true;
    }
}
