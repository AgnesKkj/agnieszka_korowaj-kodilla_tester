package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery_service;

import org.springframework.stereotype.Component;

@Component
public class NotificationPriority implements NotificationService {

    @Override
    public String success(String address) {
        String successMessage = "Priority package delivered";
        System.out.println(successMessage + " to " + address);
        return successMessage;
    }

    @Override
    public String fail(String address) {
        String failMessage = "Priority package not delivered";
        System.out.println(failMessage + " to " + address);
        return failMessage;
    }
}
