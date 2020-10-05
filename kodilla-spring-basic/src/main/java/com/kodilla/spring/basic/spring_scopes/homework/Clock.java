package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Clock {
    public Clock(int hour) {
        System.out.println("Creating clock bean: " + hour);
    }
}
