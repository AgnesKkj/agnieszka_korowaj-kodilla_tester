package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ChosenResult extends AbstractPage {

    GoogleResults googleResults;
    private WebElement chosenResultSite;
    private List<WebElement> resultsToClick;

    public ChosenResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
        resultsToClick = googleResults.getResults();
    }

    //coś się dzieje, że nie mogę poprawnie skorzystać z listy GoogleResults.results - zawsze ma albo 0 elementów, albo nieoczekiwane elementy
    public List<WebElement> storeResultsToClick() {
        resultsToClick = driver.findElements(By.xpath("//*[@class='g']"));
        System.out.println(resultsToClick.size());
        return resultsToClick;
    }

    public WebElement getChosenWebsiteElement(int index) {
        chosenResultSite = resultsToClick.get(index);
        return chosenResultSite;
    }

    public void clickChosenElement() {
        chosenResultSite.click();
    }


}
