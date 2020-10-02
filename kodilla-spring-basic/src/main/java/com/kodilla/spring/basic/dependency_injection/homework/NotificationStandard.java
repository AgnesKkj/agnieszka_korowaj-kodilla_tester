package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationStandard implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Standard package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Standard package not delivered to: " + address);
    }
}
