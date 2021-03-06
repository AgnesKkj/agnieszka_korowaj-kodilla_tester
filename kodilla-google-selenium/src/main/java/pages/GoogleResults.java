package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private static List<WebElement> results;

    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public static List<WebElement> getResults() {
        return results;
    }

    public void iSeeResults() {
        System.out.println("I see results.");
        System.out.println("Number of results: " + results.size());
    }

}
