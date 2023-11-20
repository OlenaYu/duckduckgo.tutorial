package searchtutorial.duckduckgo;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import searchtutorial.duckduckgo.pageobjects.DuckDuckGoResultsPage;
import searchtutorial.duckduckgo.pageobjects.DuckDuckGoSearchPage;
import searchtutorial.duckduckgo.steps.DuckDuckGoSearcher;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class WhenSearchingByKeyWordInDuckDuckGo {

    @Steps
    DuckDuckGoSearchPage homePage;
    @Steps
    DuckDuckGoSearcher john;
    @Test
    public void shouldSeeRelevantSearchResults() {
        homePage.openApplication();
        john.searches_by_keyword_for("Cucumber recipes");
        john.should_see_only_relevant_results_containing("Cucumber");
    }
}
