package steps.checkout;

import io.cucumber.java.en.Then;
import pages.Page;
import pages.checkout.AddressPage;
import pages.checkout.OrderConfirmationPage;
import steps.BaseSteps;

public class AddressSteps extends Page {

    @Then("^they process the address$")
    public void theyProcessAddress() {
        instanceOf(AddressPage.class).clickOnProceedToCheckout();
    }

}
