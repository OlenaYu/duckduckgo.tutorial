package searchtutorial.duckduckgo.pageobjects;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://duckduckgo.com/")
public class DuckDuckGoSearchPage extends PageObject {
    public void openApplication() {
        openUrl("https://duckduckgo.com/");
    }
    @FindBy(xpath = "//input[@id='searchbox_input']")
    WebElementFacade searchedField;//the same as WebElement in Selenium
   // WebElement searchedField = find(By.xpath("//input[@id='searchbox_input']"));

    public void enterSearchedTerms(String keyword) {
        searchedField.type(keyword);
        //searchedField.sendKeys(keyword);
    }

    @FindBy(xpath = "//button[@class='searchbox_searchButton__F5Bwq iconButton_button__6x_9C']")
    WebElementFacade searchButton;
    public void submitSearch() {
        searchButton.click();

    }
}
