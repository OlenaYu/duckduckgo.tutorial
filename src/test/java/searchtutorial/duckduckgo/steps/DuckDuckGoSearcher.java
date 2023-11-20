package searchtutorial.duckduckgo.steps;

import net.serenitybdd.annotations.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;
import searchtutorial.duckduckgo.pageobjects.DuckDuckGoResultsPage;
import searchtutorial.duckduckgo.pageobjects.DuckDuckGoSearchPage;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class DuckDuckGoSearcher {
    DuckDuckGoSearchPage searchPage;
    DuckDuckGoResultsPage resultsPage;
    @Step
    public void searches_by_keyword_for(String keyword) {

        searchPage.enterSearchedTerms(keyword);
        searchPage.submitSearch();
    }
    @Step
    public void should_see_only_relevant_results_containing(String expectedTerms) {
        List<String> results = resultsPage.getDisplayedResults();
        assertThat(results, everyItem(containsString(expectedTerms)));

    }
}
