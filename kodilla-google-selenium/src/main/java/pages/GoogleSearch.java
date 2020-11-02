package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch {

    @FindBy(css = "input[title='Search']")
    static WebElement inputField;

    @FindBy(css = "input[value='Google Search']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.navigate().to("https://www.google.com");
        PageFactory.initElements(driver,GoogleSearch.class);

        //wiersze zamykające popup
        driver.switchTo().frame(0);
        WebElement consentButton = driver.findElement(By.cssSelector("#introAgreeButton"));
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();

        inputField.sendKeys("Kodilla");
        //wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
        driver.close();

    }

    public static GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults();
        return googleResults;
    }
}