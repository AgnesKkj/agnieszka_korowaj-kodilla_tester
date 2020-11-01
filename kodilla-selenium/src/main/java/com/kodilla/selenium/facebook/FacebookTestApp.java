package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/Kodilla/Selenium/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")));
        //akceptuję ciasteczka
        WebElement inputField = driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        inputField.click();
        //klikam Create New Account - otwiera się w okienku popup
        inputField = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        inputField.click();
        //I teraz jestem przy listach rozwijanych
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[3]")));

        WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
        yearSelect.deselectAll();

        WebElement yearComboTwo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div[2]/span/span/select[3]"));
        Select yearSelectTwo = new Select(yearComboTwo);
        yearSelectTwo.selectByValue("2013");



}
}
