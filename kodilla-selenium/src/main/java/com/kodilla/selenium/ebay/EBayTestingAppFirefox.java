package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingAppFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:/Kodilla/Selenium/selenium-drivers/Firefox/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com");

        WebElement inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("Laptop");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
    }
}
