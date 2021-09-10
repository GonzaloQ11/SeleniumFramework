package steps;

import io.cucumber.java.en.Then;
import pages.AuthenticationPage;
import pages.Page;

public class AuthenticationSteps extends Page {

    @Then("^they see the Authentication page$")
    public void theySeeTheAuthenticationPage() {
        instanceOf(AuthenticationPage.class).assertSignInSubmitButtonDisplayed();
    }

}
