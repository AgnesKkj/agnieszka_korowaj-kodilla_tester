package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ChosenResult extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> resultsToClick;

    public ChosenResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public WebElement getChosenSiteWebElement(int index) {
        WebElement chosenResultSite = resultsToClick.get(index).findElement(By.tagName("a"));
        return chosenResultSite;
    }

}
