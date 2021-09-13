package pages.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class AddressPage extends CheckoutSection {
    @FindBy(how = How.CSS, using = "[name=\"processAddress\"]")
    private WebElement  proceedToCheckoutButton;
    public void clickOnProceedToCheckout() {
        elementHelpers.weClick(proceedToCheckoutButton);
    }

}
