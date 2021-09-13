package steps.checkout;

import io.cucumber.java.en.And;
import pages.Page;
import pages.checkout.ShippingPage;

public class ShippingSteps extends Page {

    @And("^they process the carrier")
    public void theyProcessAddress() {
        instanceOf(ShippingPage.class).clickOnProceedToCheckout();
    }

    @And("^they click on checkbox$")
    public void theyClickOnCheckbox() {
        instanceOf(ShippingPage.class).clickOnCheckbox();
    }

}
