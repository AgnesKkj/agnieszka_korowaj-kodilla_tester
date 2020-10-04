package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery_service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NotificationStandard implements NotificationService {

    @Override
    public String success(String address) {
        String successMessage = "Standard package delivered";
        System.out.println(successMessage + " to " + address);
        return successMessage;
    }

    @Override
    public String fail(String address) {
        String failMessage = "Standard package not delivered";
        System.out.println(failMessage + " to " + address);
        return failMessage;
    }
}
