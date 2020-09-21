
package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

/*class ShopTestSuite {

    static final LocalDate now = LocalDate.now();

    Shop shop = new Shop();
    Order laptop = new Order(750.50,LocalDate.of(2020,9,18),"BrianDG");
    Order table = new Order(500.00, LocalDate.of(2020,9,19),".#notWaltWhite#.");
    Order labGlassware = new Order(1500.00, LocalDate.of(2020,7,12), ".#notWaltWhite#.");
    Order microphone = new Order(100.00, LocalDate.of(2020,9,15),"rEtSuKo93");
    Order lamp = new Order(250.00, LocalDate.of(2020,9,18), "Margette");
    Order carpet = new Order(450.00, LocalDate.of(2020,9,17),"Sultan_Jaff");
    Order bustStatue = new Order(600,LocalDate.of(2020,9,18), "DahliaEightyNine");

    //czy dodaje obiekty do seta
    @Test
    public void shouldAddObjectsToShop() {
        assertEquals(7, shop.getSize());
    }

    //czy nie dodaje obiektu o wartości 0
    @Test
    public void shouldNotAddObjectIfValueZero() {
        Order worthless = new Order(0,LocalDate.of(2020,9,18),"test");
        shop.addOrder(worthless);
        assertNotEquals(8, shop.getSize());
        assertEquals(7, shop.getSize());
    }

    //czy nie dodaje obiektu o dacie późniejszej niż now
    @Test
    public void shouldNotAddObjectIfLocalDateAfterNow() {
        System.out.println(now);
        Order fromFuture = new Order(100.05,LocalDate.of(2020,10,15),"test");
        shop.addOrder(fromFuture);
        assertNotEquals(8, shop.getSize());
        assertEquals(7, shop.getSize());
    }

    //czy zwraca obiekty przefiltrowane wg dat
    @Test
    public void shouldReturnObjectsByPermittedDates() {
        //given
        System.out.println("Now is: " + now);
        //when
        //tu powiązać z metodą filtrującą 2 ostatnie daty wstecz
        //then
        System.out.println("");
        //assertEquals();
    }

    //czy nie zwraca obiektów za daleko wstecz
    @Test
    public void shouldReturnNullWhenObjectDateBeforePermitted() {
        //given
        shop.clear();
        shop.addOrder(labGlassware);
        shop.addOrder(microphone);
        System.out.println("Now is: " + now);
        System.out.println("");
        //assertEquals();
    }

    //analogicznie: czy nie zwraca obiektu z przyszłości

    //czy z podanego zakresu zwraca poprawną wartość min


    //czy z podanego zakresu zwraca poprawną wartość max





    //czy sumuje poprawnie wartości wszystkich zamówień
    @Test
    public void shouldSumAllOrderValues() {
        shop.clear();
        shop.addOrder(table);
        shop.addOrder(labGlassware);
        System.out.println(shop.sumOrders());
        assertEquals(2000,shop.sumOrders());
    }

    //czy zatrzymuje sumowanie przy pustej liście
    @Test
    public void shouldReturnNullWhenSummingEmptyShop() {
        shop.clear();
        System.out.println(shop.sumOrders());
        assertNull(shop.sumOrders());
    }


    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @BeforeEach
    public void initializeShop() {
        System.out.println("Adding instances to shop...");
        shop.addOrder(laptop);
        shop.addOrder(table);
        shop.addOrder(labGlassware);
        shop.addOrder(microphone);
        shop.addOrder(lamp);
        shop.addOrder(carpet);
        shop.addOrder(bustStatue);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
        System.out.println("Shop size: " + shop.getSize());
    }

    @AfterAll
    public static void displayGoodByeMessage() {

        System.out.println("Finishing testing");
    }

}*/
