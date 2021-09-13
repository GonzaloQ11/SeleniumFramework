package steps.checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Page;
import pages.checkout.PaymentPage;

public class PaymentSteps extends Page {

    @And("^they click on Pay by bank wire button")
    public void theyClickOnPayByBankWireButton() throws Throwable {
        instanceOf(PaymentPage.class).clickOnPayByBankWire();
    }

    @And("^they click on confirm my order")
    public void theyClickOnConfirmMyOrderButton() throws Throwable {
        instanceOf(PaymentPage.class).clickOnConfirmMyOrder();
    }

}
