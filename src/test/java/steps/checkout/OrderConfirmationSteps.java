package steps.checkout;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page;
import pages.checkout.OrderConfirmationPage;
import pages.checkout.PaymentPage;

public class OrderConfirmationSteps extends Page {

    @Then("^they see the order status message  \"([^\"]*)\"$")
    public void theySeeTheOrderStatusMessage(String orderStatusMessage) throws Throwable {
        instanceOf(OrderConfirmationPage.class).validateOrderStatusMessage(orderStatusMessage);
    }

}
