package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SearchResultToClick extends AbstractPage {

    GoogleResults googleResults;
    private List<WebElement> resultsToClick;

    public SearchResultToClick(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
        resultsToClick = googleResults.getResults();
    }

    public List<WebElement> getResultsToClick() {
        System.out.println(resultsToClick);
        return resultsToClick;
    }

    public WebElement createResultToClick(int index) {
        System.out.println(getResultsToClick().size());
        return getResultsToClick().get(index);
    }

}
