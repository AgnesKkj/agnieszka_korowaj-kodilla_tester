package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ChosenResult extends AbstractPage {

    GoogleResults googleResults;

    private List<WebElement> resultsToClick;

    public ChosenResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
        resultsToClick = googleResults.getResults();
    }

    public WebElement getChosenSiteWebElement(int index) {
        WebElement chosenResultSite = resultsToClick.get(index);
        return chosenResultSite;
    }

}
