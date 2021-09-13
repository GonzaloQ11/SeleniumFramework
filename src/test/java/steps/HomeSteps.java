package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class HomeSteps extends Page {

    @When("^they click on Sign in button")
    public void theyClickOnSignInButton() throws Throwable {
        instanceOf(HomePage.class).clickOnSignInButton();
    }

    @And("^they click on the header logo")
    public void theyClickOnTheHeaderLogo() throws Throwable {
        instanceOf(HomePage.class).clickOnHomePage();
    }

    @And("^they search the product \"([^\"]*)\"$")
    public void theySearchForTheProduct(String product) throws Throwable {
        instanceOf(HomePage.class).searchProduct(product);
    }

    @Then("^they see the Sign in button")
    public void theySeeTheSignInButton() {
        instanceOf(HomePage.class).assertSignInButtonDisplayed();
    }

}
