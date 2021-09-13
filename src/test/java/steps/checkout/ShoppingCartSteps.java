package steps.checkout;

import io.cucumber.java.en.And;
import pages.BasePage;
import pages.checkout.ShoppingCartPage;

public class ShoppingCartSteps extends BasePage {
    @And("^they confirm shopping cart products")
    public void theyClickOnProceedToCheckout() {
        instanceOf(ShoppingCartPage.class).clickOnProceedToCheckoutButton();
    }
}
