package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.Page;

public class BaseSteps extends BasePage {

    @Then("^they see the page title contains \"([^\"]*)\"$")
    public void they_see_the_page_title_contains(String expectedTitle) throws Throwable {
        validatePageTitle(expectedTitle);
    }

    @Given("^(?:a DuckDuckGo user|an internet user|a user) is on the (?:base|search) page$")
    public void userIsOnTheBasePage() {
        instanceOf(BasePage.class).navigateToBaseUrl();
    }

    @Then("^they see the page Url contains \"([^\"]*)\"$")
    public void theySeeThePageUrlContains(String expectedUrl) throws Throwable {
        validatePageUrl(expectedUrl);
    }

    @Then("^they see \"([^\"]*)\" in the PageSource$")
    public void theySeeInThePageSource(String expectedPageSource) {
        validatePageSource(expectedPageSource);
    }
}