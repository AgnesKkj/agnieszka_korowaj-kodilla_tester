package com.kodilla.spring.basic.spring_scopes.homework;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateABean() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Clock firstClockBean = (Clock) context.getBean("clock", LocalDateTime.of(2020,10,15,12,00));
        assertNotNull(firstClockBean);
    }

    @Test
    public void shouldCreateDifferentClockBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes");
        Clock firstBean = (Clock) context.getBean("clock", LocalDateTime.of(2020,10,05,16,00));
        Clock secondBean = (Clock) context.getBean("clock", LocalDateTime.of(2020,10,05,15,00));
        Clock thirdBean = (Clock) context.getBean("clock", LocalDateTime.of(2020,10,05,14,00));
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }

}