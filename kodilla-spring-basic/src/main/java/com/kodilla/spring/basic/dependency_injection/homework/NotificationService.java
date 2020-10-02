package com.kodilla.spring.basic.dependency_injection.homework;

public interface NotificationService {

    public void success(String address);
    public void fail(String address);

    /*public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }*/
}