package steps;

import io.cucumber.java.en.And;
import pages.BasePage;
import pages.SearchResultsPage;

public class SearchResultsSteps extends BasePage {

    @And("^they click on product search result$")
    public void theyClickOnProduct() {
        instanceOf(SearchResultsPage.class).clickOnProduct();
    }
}
