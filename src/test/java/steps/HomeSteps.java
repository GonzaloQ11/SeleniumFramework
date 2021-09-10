package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class HomeSteps extends Page {

    @When("^they click on Sign in button")
    public void theyClickOnSignInButton() throws Throwable {
        instanceOf(HomePage.class).clickOnSignInButton();
    }

    @Then("^they see the Sign in button")
    public void theySeeTheSignInButton() {
        instanceOf(HomePage.class).assertSignInButtonDisplayed();
    }

}
