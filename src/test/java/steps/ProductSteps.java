package steps;

import io.cucumber.java.en.And;
import pages.BasePage;
import pages.ProductPage;

public class ProductSteps extends BasePage {
    @And("^they click the Add To Cart button$")
    public void theyClickOnAddToCart() {
        instanceOf(ProductPage.class).clickOnAddToCart();
    }
    @And("^they click the Proceed To Checkout button$")
    public void theyClickOnProceedToCheckout() {
        instanceOf(ProductPage.class).clickOnProceedToCheckoutButton();
    }

}
