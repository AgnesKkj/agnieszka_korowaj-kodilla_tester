package com.kodilla.selenium.allegro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestAppFirefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:/Kodilla/Selenium/selenium-drivers/Firefox/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        //podana w teorii opcja z Alertem z jakiegoś powodu nie działa, więc klikam przycisk w popup po ścieżce absolutnej
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[8]/div/div[2]/div/div[2]/button[2]")));
        WebElement gdprPopup = driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div[2]/div/div[2]/button[2]"));
        gdprPopup.click();

        WebElement inputFieldSearch = driver.findElement(
                By.xpath("//*[@class=\"mp4t_8 mp4t_0_m mryx_8 mryx_0_s m7er_k4 _fee54_O2svT\"]/div/div/form/input"));
        inputFieldSearch.sendKeys("Mavic mini");

        WebElement categoryCombo = driver.findElement(
                By.xpath("//*[@class=\"mp7g_oh mr3m_1 _r65gb\"]/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("/kategoria/elektronika");

        inputFieldSearch.submit();

    }
}
