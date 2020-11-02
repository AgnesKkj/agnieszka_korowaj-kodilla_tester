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

import static org.junit.Assert.assertEquals;

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
    public void clickByChosenIndex() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        ChosenResult chosenResult = new ChosenResult(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(chosenResult.getChosenSiteWebElement(3))).click();
    }

    @Test
    public void clickedElementIsTheExpectedOne() {
        //given
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        ChosenResult chosenResult = new ChosenResult(driver);
        //when
        WebElement expectedClickable = driver.findElement(By.cssSelector("#rso > div:nth-child(13) > div > div.yuRUbf > a"));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(expectedClickable));
        wait.until(ExpectedConditions.elementToBeClickable(chosenResult.getChosenSiteWebElement(3))).click();
        //then
        assertEquals(expectedClickable.getText(), chosenResult.getChosenSiteWebElement(3).getText());
    }



}
