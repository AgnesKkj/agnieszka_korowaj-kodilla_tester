package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class SimpleApplicationTestSuite {

    @Test
    public void shouldReturnCorrectSkypeMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.send("Skype test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldReturnCorrectTextMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        TextMessageService bean = context.getBean(TextMessageService.class);
        String message = bean.send("Text msg test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldReturnCorrectFacebookMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FacebookMessageService bean = context.getBean(FacebookMessageService.class);
        String message = bean.send("Facebook msg test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }

    @Test
    public void doesNotProcessMessageWithEmptyReceiver() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "");
        Assertions.assertNull(message);
    }

}