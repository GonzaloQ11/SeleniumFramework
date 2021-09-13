package pages.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class PaymentPage extends CheckoutSection {
    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    private WebElement payByBankWireButton;
    @FindBy(how = How.CSS, using = "#cart_navigation [type=submit]")
    private WebElement confirmOrderButton;

    public void clickOnPayByBankWire() {
        elementHelpers.weClick(payByBankWireButton);
    }
    public void clickOnConfirmMyOrder() {
        elementHelpers.weClick(confirmOrderButton);
    }

}
