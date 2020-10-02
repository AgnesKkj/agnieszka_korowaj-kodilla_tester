package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationPriority implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Priority package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Priority package not delivered to: " + address);
    }
}
