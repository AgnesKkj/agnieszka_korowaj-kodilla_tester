package com.kodilla.notification;

public interface MobilePhone {

    //Chcąc korzystać z Mockito, nie tworzymy klas obiektów, tylko interfejs metod, które będziemy wywoływać na pseudoobiekcie

    boolean needsCharging();
    double getFreeStorage();
    void launchApplication(String applicationName);
}