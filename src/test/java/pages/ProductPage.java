package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage{
    @FindBy(how = How.ID, using = "add_to_cart")
    private WebElement addToCartButton;

    @FindBy(how = How.CSS, using = "[title=\"Proceed to checkout\"]")
    private WebElement proceedToCheckoutButton;

    public void clickOnAddToCart() {
        elementHelpers.weClick(addToCartButton);
    }

    public void clickOnProceedToCheckoutButton() {
        elementHelpers.weClick(proceedToCheckoutButton);
    }

}
