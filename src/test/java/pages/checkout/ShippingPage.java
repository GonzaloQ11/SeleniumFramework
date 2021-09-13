package pages.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingPage extends CheckoutSection{
    @FindBy(how = How.CSS, using = "[name=\"processCarrier\"]")
    private WebElement proceedToCheckoutButton;
    @FindBy(how = How.ID, using = "uniform-cgv")
    private WebElement checkbox;

    public void clickOnProceedToCheckout() {
        elementHelpers.weClick(proceedToCheckoutButton);
    }

    public void clickOnCheckbox() {
        elementHelpers.weClick(checkbox);
    }

}
