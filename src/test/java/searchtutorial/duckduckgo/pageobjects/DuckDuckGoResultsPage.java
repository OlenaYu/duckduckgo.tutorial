package searchtutorial.duckduckgo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.stream.Collectors;

public class DuckDuckGoResultsPage extends PageObject {
    private static final String RESULT_TITLES = "//article[@data-testid='result']";

    public List<String> getDisplayedResults() {
        return $$(RESULT_TITLES).stream().
                map(element -> element.getAttribute("textContent")).collect(Collectors.toList());
    }

}

