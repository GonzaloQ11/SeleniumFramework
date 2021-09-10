package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends BasePage{
    @FindBy(how = How.CLASS_NAME, using = "login")
    public WebElement signInButton;

    public void assertSignInButtonDisplayed() {
        Assert.assertTrue(elementHelpers.weElementIsDisplayed(signInButton));
    }

    public AuthenticationPage clickOnSignInButton() {
        elementHelpers.weClick(signInButton);
        return instanceOf(AuthenticationPage.class);
    }
}
