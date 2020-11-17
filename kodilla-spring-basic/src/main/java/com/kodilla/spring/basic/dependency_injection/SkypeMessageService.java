package com.kodilla.spring.basic.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class SkypeMessageService implements MessageService {

    @Override
    @Autowired
    public String send(String message, String receiver) {
        System.out.println("Sending [" + message + "] to: " + receiver + " using Skype");
        return message;
    }
}
