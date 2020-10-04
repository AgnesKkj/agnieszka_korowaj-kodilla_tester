package com.kodilla.spring.basic.spring_dependency_injection.homework.delivery_service;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework.delivery_service");
    DeliveryService deliveryBean = context.getBean(DeliverStandard.class);
    NotificationService notifBean = context.getBean(NotificationStandard.class);
    ShippingCenter shippingBean = context.getBean(ShippingCenter.class);
    String success = notifBean.success("Test");
    String fail = notifBean.fail("Test");

    @Test
    public void shouldDeliverPackagePermittedWeight() {
        boolean delivered = deliveryBean.deliverPackage("Test", 15.0);
        assertTrue(delivered);
    }

    @Test
    public void shouldNotDeliverPackageWrongWeight() {
        boolean delivered = deliveryBean.deliverPackage("Test", 35.0);
        assertFalse(delivered);
    }

    @Test
    public void shouldReturnSuccessMessageIfSentPackage() {
        String sent = shippingBean.sendPackage("Test", 15.0);
        assertEquals(success, sent);
    }

    @Test
    public void shouldReturnFailMessageIfNotSentPackage() {
        String sent = shippingBean.sendPackage("Test", 35.0);
        assertEquals(fail, sent);
    }

    @Test
    public void shouldNotReturnSuccessMessageIfNotSent() {
        String sendingMessage = shippingBean.sendPackage("Test", 35.0);
        assertNotEquals(success,sendingMessage);
    }

    @Test
    public void shouldNotReturnFailMessageIfSent() {
        String sendingMessage = shippingBean.sendPackage("Test", 15.0);
        assertNotEquals(fail,sendingMessage);
    }

}