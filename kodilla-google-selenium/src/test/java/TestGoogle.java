// W Google już się pozmieniało i testy nie przejdą


/*
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ChosenResult;
import pages.GoogleSearch;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void chooseElementToBeClickedByIndex() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        ChosenResult chosenResult = new ChosenResult(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        googleSearch.searchResults();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='g']")));
        chosenResult.storeResultsToClick();

        //when
        //chcę wywołać 5. wynik wyszukiwania - to się zmienia dość szybko, strony poniżej strony głównej Kodilli
        // potrafią "wymieniać się" miejscami przy kolejnych próbach uruchomienia testu przez pozycjonowanie SEO

        WebElement expectedClickable = driver.findElement(By.xpath("//*[@class='g'][5]/div/div[1]/a/h3/span"));
        System.out.println("Expected: " + expectedClickable.getText());

        List<String> allowedResults = new ArrayList<>();
        allowedResults.add("Czy warto iść na kurs programowania Kodilla? - Girl Into The ...");
        allowedResults.add("Kodilla - opinie, informacje, kursy | Bootcampy.pl");
        allowedResults.add("Dlaczego wybrałam Bootcamp Kodilla | BedeProgramistka.pl");
        allowedResults.add("Kodilla - Home | Facebook");
        allowedResults.add("Kodilla - znaleziska i wpisy o #kodilla w Wykop.pl");

        wait.until(ExpectedConditions.visibilityOf(expectedClickable));
        chosenResult.getChosenWebsiteElement(4);

        String chosenElementHeadline = chosenResult.getChosenWebsiteElement(4).findElement(By.tagName("span")).getText();
        System.out.println(chosenElementHeadline);

        //then
        assertTrue(allowedResults.contains(chosenElementHeadline));
    }

    @Test
    public void elementChosenToBeClickedIsNotUnexpectedOne() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        ChosenResult chosenResult = new ChosenResult(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        googleSearch.searchResults();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='g']")));
        chosenResult.storeResultsToClick();

        //when
        //wybieram na wynik false stronę główną Kodilli (wynik 1.)
        WebElement expectedToBeFalse = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span"));
        String expectedToBeFalseTitle = expectedToBeFalse.getText();
        System.out.println("Expected to assert false: " + expectedToBeFalseTitle);
        chosenResult.getChosenWebsiteElement(4);

        String chosenElementHeadline = chosenResult.getChosenWebsiteElement(4).findElement(By.tagName("span")).getText();
        System.out.println("Chosen by method: " + chosenElementHeadline);

        //then
        assertNotEquals(expectedToBeFalseTitle,chosenElementHeadline);
    }

    @Test
    public void clickedElementIsOneChosenToBeClicked() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        ChosenResult chosenResult = new ChosenResult(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        googleSearch.searchResults();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='g']")));
        chosenResult.storeResultsToClick();

        //when
        //tu zaczęło wychodzić na Index Out Of Bounds, bo jest już tylko 5 wyników na 1. stronie wyszukiwania
        chosenResult.getChosenWebsiteElement(5);
        String expectedTitle = chosenResult.getChosenWebsiteElement(5).findElement(By.tagName("span")).getText();
        chosenResult.clickChosenElement();
        //czekam na załadowanie nowej strony
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body")));
        String openedWebsiteTitle = driver.getTitle();
        System.out.println(openedWebsiteTitle);
        //then
        assertEquals(expectedTitle, openedWebsiteTitle);
    }

    @Test
    public void clickedElementIsNotOneNotChosenToBeClicked() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        ChosenResult chosenResult = new ChosenResult(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        googleSearch.searchResults();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='g']")));
        chosenResult.storeResultsToClick();

        //when
        //wybieram na wynik false stronę główną Kodilli (wynik 1.)
        WebElement expectedToBeFalse = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span"));
        String expectedToBeFalseTitle = expectedToBeFalse.getText();
        System.out.println("Expected to assert false: " + expectedToBeFalseTitle);

        chosenResult.getChosenWebsiteElement(5);
        chosenResult.clickChosenElement();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body")));
        String openedWebsiteTitle = driver.getTitle();
        System.out.println(openedWebsiteTitle);

        //then
        assertNotEquals(expectedToBeFalseTitle, openedWebsiteTitle);

    }


}
*/
