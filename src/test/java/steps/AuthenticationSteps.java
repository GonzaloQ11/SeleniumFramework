package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AuthenticationPage;
import pages.Page;

public class AuthenticationSteps extends Page {

    @Then("^they see the Authentication page$")
    public void theySeeTheAuthenticationPage() {
        instanceOf(AuthenticationPage.class).assertSignInSubmitButtonDisplayed();
    }

    @And("^they enter the email \"([^\"]*)\"$")
    public void theyEnterTheEmail(String email) {
        instanceOf(AuthenticationPage.class).enterEmail(email);
    }

    @And("^they enter the password \"([^\"]*)\"$")
    public void theyEnterThePassword(String password) {
        instanceOf(AuthenticationPage.class).enterPassword(password);
    }

    @And("^they click the Submit Sign in Button$")
    public void theyClickTheSubmitSignInButton() {
        instanceOf(AuthenticationPage.class).clickOnSubmitSignInButton();
    }

    @Then("^they see the error message \"([^\"]*)\"$")
    public void theySeeErrorMessage(String errorMessage) {
        instanceOf(AuthenticationPage.class).assertErrorMessage(errorMessage);
    }


}
