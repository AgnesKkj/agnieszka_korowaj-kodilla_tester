package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Kodilla/Selenium/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kodilla.com/pl/sign-in");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));

        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        inputField.sendKeys("testuser@gmail.com");
        inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        inputField.sendKeys("Haslo");
    }
}
