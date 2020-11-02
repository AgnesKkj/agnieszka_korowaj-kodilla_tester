import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearch;
import pages.SearchResultToClick;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
    public void clickedResultIsThePickedOne() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        SearchResultToClick searchResultToClick = new SearchResultToClick(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //when
        WebElement expectedResult = searchResultToClick.createResultToClick(3);
        wait.until(ExpectedConditions.elementToBeClickable(expectedResult)).click();
        //then
        WebElement resultToClick = searchResultToClick.createResultToClick(3);
        wait.until(ExpectedConditions.elementToBeClickable(resultToClick)).click();
        assertEquals(expectedResult.getText(), resultToClick.getText());
    }

    @Test
    public void clickedResultIsNotOneNotPicked() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        SearchResultToClick searchResultToClick = new SearchResultToClick(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //when
        WebElement expectedResult = searchResultToClick.createResultToClick(4);
        wait.until(ExpectedConditions.elementToBeClickable(expectedResult)).click();
        //then
        WebElement resultToClick = searchResultToClick.createResultToClick(2);
        wait.until(ExpectedConditions.elementToBeClickable(resultToClick)).click();
        assertNotEquals(expectedResult.getText(), resultToClick.getText());
    }

}
