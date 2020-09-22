
package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    static final LocalDate now = LocalDate.now();

    Shop shop = new Shop();
    Order laptop = new Order(750.50,LocalDate.now().minusDays(1),"BrianDG");
    Order table = new Order(500.00, LocalDate.of(2020,9,22),".#notWaltWhite#.");
    Order labGlassware = new Order(1500.00, LocalDate.of(2020,9,12), ".#notWaltWhite#.");
    Order microphone = new Order(100.00, LocalDate.now().minusDays(1),"rEtSuKo93");
    Order lamp = new Order(250.00, LocalDate.of(2020,9,20), "Margette");
    Order carpet = new Order(450.00, LocalDate.now(),"Sultan_Jaff");
    Order bustStatue = new Order(600,LocalDate.of(2020,9,18), "DahliaEightyNine");

    //czy zwiększa size() po dodaniu podanych obiektów do kolekcji,
    @Test
    public void shouldAddObjectsToShop() {
        assertEquals(7, shop.getSize());
    }

    //czy zatrzymuje dodanie obiektu o wartości 0,
    @Test
    public void shouldNotAddObjectIfValueZero() {
        shop.addOrder(new Order(0,LocalDate.of(2020,9,18),"test"));
        assertEquals(7, shop.getSize());
    }

    //czy zatrzymuje dodanie obiektu o wartości ujemnej,
    @Test
    public void shouldNotAddObjectIfValueNegative() {
        shop.addOrder(new Order(-100,LocalDate.of(2020,9,18),"test"));
        assertEquals(7, shop.getSize());
    }

    //czy zatrzymuje dodanie obiektu o dacie późniejszej od now,
    @Test
    public void shouldNotAddObjectIfLocalDateAfterNow() {
        System.out.println("Now: " + now);
        shop.addOrder(new Order(100.05,LocalDate.now().plusDays(3),"AfterToday"));
        assertEquals(7, shop.getSize());
    }

    //czy przy pustym loginie zamawiającego zamienia na “Anonymous”,
    @Test
    public void shouldReplaceEmptyWhoOrderedWithAnonymous() {
        Order emptyBuyer = new Order(100,LocalDate.of(2020,9,22), "");
        shop.addOrder(emptyBuyer);
        assertEquals("Anonymous", emptyBuyer.getWhoOrdered());
        assertEquals(8, shop.getSize());
    }

    //czy zwraca prawidłową listę obiektów dla dat mieszczących się w dozwolonym zakresie,
    @Test
    public void shouldReturnObjectsByPermittedDates() {
        System.out.println("Now is: " + now);
        shop.clear();
        shop.addOrder(laptop);
        shop.addOrder(microphone);
        assertEquals(2,shop.filterOrdersByDate().size());
    }

    //czy zwraca null/ alternatywną wiadomość, jeśli nie ma zamówień w podanym zakresie dat,
    @Test
    public void shouldReturnNullIfNoObjectsPassFiltering() {
        shop.clear();
        shop.addOrder(bustStatue);
        assertNull(shop.filterOrdersByDate());
    }

    //czy nie zwraca obiektów za daleko wstecz
    @Test
    public void shouldNotReturnWhenObjectDateBeforePermitted() {
        System.out.println("Now is: " + now);
        shop.clear();
        shop.addOrder(new Order(300,LocalDate.now().minusDays(2),"TooEarly"));
        assertNull(shop.filterOrdersByDate());
    }

    //analogicznie: czy nie zwraca obiektu z przyszłości
    @Test
    public void shouldNotReturnlWhenObjectDateBeforePermitted() {
        System.out.println("Now is: " + now);
        shop.clear();
        shop.addOrder(new Order(300,LocalDate.now().plusDays(1),"InTheFuture"));
        assertNull(shop.filterOrdersByDate());
    }

    //czy zwraca 0/ zatrzymuje każdą z tych metod przy podanym pustym zakresie,
    @Test
    public void shouldReturnNullWhenLookingForMinMaxValuesIfNoOrdersInFilteredRange() {
        shop.clear();
        shop.addOrder(bustStatue);
        assertEquals(0,shop.returnsMinValueOfFilteredOrders());
        assertEquals(0,shop.returnsMaxValueOfFilteredOrders());
    }

    //czy z podanego zakresu zwraca poprawną wartość min
    @Test
    public void shouldReturnTheRightMinValueOfFilteredOrders() {
        System.out.println(shop.filterOrdersByDate());
        assertEquals(100,shop.returnsMinValueOfFilteredOrders());
    }

    //czy z podanego zakresu zwraca poprawną wartość max

    @Test
    public void shouldReturnTheRightMaxValueOfFilteredOrders() {
        System.out.println(shop.filterOrdersByDate());
        assertEquals(750.5,shop.returnsMaxValueOfFilteredOrders());
    }


    //czy sumuje poprawnie wartości wszystkich zamówień
    @Test
    public void shouldSumAllOrderValues() {
        System.out.println(shop.sumOrders());
        assertEquals(4150.5, shop.sumOrders());
        shop.clear();
        shop.addOrder(table);
        shop.addOrder(labGlassware);
        assertEquals(2000,shop.sumOrders());
    }

    //czy zwraca 0/ wyświetla alternatywną wiadomość przy pustym zakresie,
    @Test
    public void shouldReturnNullWhenSummingEmptyShop() {
        shop.clear();
        assertEquals(0, shop.sumOrders());
    }


    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @BeforeEach
    public void initializeShop() {
        System.out.println("Initializing shop...");
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
    }

    @AfterAll
    public static void displayGoodByeMessage() {

        System.out.println("Finishing testing");
    }

}
