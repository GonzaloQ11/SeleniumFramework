package pages.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class CheckoutSection extends BasePage {
    @FindBy(how = How.XPATH, using = "//p//*[contains(text(),\"Proceed to checkout\")]")
    private WebElement proceedToCheckoutButton;

}
