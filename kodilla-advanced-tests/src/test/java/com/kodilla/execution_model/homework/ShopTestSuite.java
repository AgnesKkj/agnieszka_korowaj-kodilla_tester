package com.kodilla.execution_model.homework;
import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order laptop = new Order(750.50,LocalDate.of(2020,9,21),"BrianDG");
    Order table = new Order(500.00, LocalDate.of(2020,9,22),".#notWaltWhite#.");
    Order labGlassware = new Order(1500.00, LocalDate.of(2020,9,12), ".#notWaltWhite#.");
    Order microphone = new Order(100.00, LocalDate.of(2020,9,18),"rEtSuKo93");
    Order lamp = new Order(250.00, LocalDate.of(2020,9,20), "Margette");
    Order carpet = new Order(450.00, LocalDate.of(2020,9,22),"Sultan_Jaff");
    Order bustStatue = new Order(600,LocalDate.of(2020,9,18), "DahliaEightyNine");

    //czy zwiększa size() po dodaniu podanych obiektów do kolekcji,
    @Test
    public void shouldAddObjectsToShop() {
        assertEquals(7, shop.getSize());
    }

    //czy zatrzymuje dodanie obiektu o wartości 0 lub ujemnej,
    @Test
    public void shouldNotAddObjectIfValueZeroOrNegative() {
        shop.addOrder(new Order(0,LocalDate.of(2020,9,18),"test"));
        shop.addOrder(new Order(-100,LocalDate.of(2020,9,18),"test"));
        assertEquals(7, shop.getSize());
    }

    //czy zatrzymuje dodanie obiektu o dacie późniejszej od now,
    @Test
    public void shouldNotAddObjectIfOrderDateAfterNow() {
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
    public void shouldReturnFilteredObjectListByPermittedDates() {
        assertEquals(3,shop.getOrdersByDateRange(LocalDate.of(2020,9,15), LocalDate.of(2020,9,20)).size());
    }

    //czy zwraca null/ alternatywną wiadomość, jeśli nie ma zamówień w podanym zakresie dat,
    @Test
    public void shouldReturnNullAndMessageIfNoObjectsInGivenDateRange() {
        shop.clear();
        assertNull(shop.getOrdersByDateRange(LocalDate.of(2020,9,1), LocalDate.of(2020,9,19)));
    }

    //czy zwraca nul zakresu za daleko wstecz
    @Test
    public void shouldReturnNullWhenObjectDateFromBeforePermitted() {
        shop.clear();
        shop.addOrder(new Order(200, LocalDate.of(2020,8,31), "test"));
        assertNull(shop.getOrdersByDateRange(LocalDate.of(2020,9,1), LocalDate.of(2020,9,19)));
    }

    //czy zwraca null przy dacie za daleko w przód
    @Test
    public void shouldReturnNullWhenObjectDateToAfterPermitted() {
        shop.clear();
        shop.addOrder(new Order(200, LocalDate.of(2020,9,20), "test"));
        assertNull(shop.getOrdersByDateRange(LocalDate.of(2020,9,1), LocalDate.of(2020,9,19)));
    }

    //czy zwraca null, kiedy dateFrom jest późniejsza niż dateTo
    @Test
    public void shouldReturnNullWhenDateFromIsAfterDateTo() {
        shop.clear();
        assertNull(shop.getOrdersByDateRange(LocalDate.of(2020,9,10), LocalDate.of(2020,9,3)));
    }

    //czy zwraca null, kiedy dateFrom lub dateTo wypadają w przyszłości
    @Test
    public void shouldReturnNullWhenDatesAreAfterNow() {
        assertNull(shop.getOrdersByDateRange(LocalDate.of(2020,9,10), LocalDate.now().plusDays(3)));
        assertNull(shop.getOrdersByDateRange(LocalDate.now().plusDays(3), LocalDate.now().plusDays(5)));
    }

    //czy zwraca poprawny zakres zamówień wg min i max wartości,
    @Test
    public void shouldReturnRightListAccordingToMinMaxRange() {
        assertEquals(4,shop.getOrdersByMinMaxValue(300,1000).size());
    }

    //czy zwraca null, kiedy podamy wartość ujemną do wyszukiwania
    @Test
    public void shouldReturnNullIfMinOrMaxIsNegative() {
        assertNull(shop.getOrdersByMinMaxValue(-100,500));
        assertNull(shop.getOrdersByMinMaxValue(-300,-200));
    }

    //czy zwraca null, kiedy minValue > maxValue
    @Test
    public void shouldReturnNullIfMinGreaterThanMax() {
        shop.clear();
        assertNull(shop.getOrdersByMinMaxValue(1000,100));
    }

    //czy sumuje poprawnie wartości wszystkich zamówień
    @Test
    public void shouldSumAllOrderValues() {
        shop.clear();
        shop.addOrder(table);
        shop.addOrder(labGlassware);
        assertEquals(2000,shop.sumOrders());
    }

    //czy zwraca 0/ wyświetla alternatywną wiadomość przy pustym zakresie,
    @Test
    public void shouldReturnZeroAndMessageWhenSummingEmptyShop() {
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