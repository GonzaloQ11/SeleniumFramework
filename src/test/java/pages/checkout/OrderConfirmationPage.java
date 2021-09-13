package pages.checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import pages.BasePage;

public class OrderConfirmationPage extends CheckoutSection {

    @FindBy(how = How.CSS, using = ".cheque-indent strong")
    private WebElement orderStatus;

    public void validateOrderStatusMessage(String expectedOrderStatusMessage) {
        String actualOrderMessage = elementHelpers.weGetAttribute(orderStatus, "textContent");
        Assert.assertEquals(actualOrderMessage, expectedOrderStatusMessage);
    }

}
