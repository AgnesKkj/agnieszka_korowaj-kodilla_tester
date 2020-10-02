package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryPriority = new DeliverPriority();
        NotificationService notificationPriority = new NotificationPriority();
        DeliveryService deliveryStandard = new DeliverStandard();
        NotificationService notificationStandard = new NotificationStandard();

        ShippingCenter shippingPriority = new ShippingCenter(deliveryPriority, notificationPriority);
        ShippingCenter shippingStandard = new ShippingCenter(deliveryStandard, notificationStandard);
        shippingPriority.sendPackage("Hill Street 11, New York", 18.2);
        shippingStandard.sendPackage("Hill Street 13, New York", 34.2);
    }
}