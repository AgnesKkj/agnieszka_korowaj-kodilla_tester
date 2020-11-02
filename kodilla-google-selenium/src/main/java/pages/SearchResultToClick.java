package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class SearchResultToClick extends GoogleResults {

    public SearchResultToClick(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public WebElement createResultToClick(int index) {
        System.out.println(results.size());
        return results.get(index);
    }

}
