package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ClockTestSuite {

    @Test
    public void shouldCreateDifferentClockBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Clock firstBean = (Clock) context.getBean("clock", 16);
        Clock secondBean = (Clock) context.getBean("clock", 15);
        Clock thirdBean = (Clock) context.getBean("clock", 14);
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }

}