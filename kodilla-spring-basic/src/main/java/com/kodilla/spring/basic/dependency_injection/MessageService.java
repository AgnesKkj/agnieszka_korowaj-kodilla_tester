package com.kodilla.spring.basic.dependency_injection;

public interface MessageService {

    String send(String message, String receiver);

    /*public void send(String message, String receiver) {
        System.out.println("Sending message [" + message + "] to: " + receiver);
    }*/
}
