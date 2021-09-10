package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

public class AuthenticationPage extends BasePage{
    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement signInSubmitButton;
    public void assertSignInSubmitButtonDisplayed() {
        Assert.assertTrue(elementHelpers.weElementIsDisplayed(signInSubmitButton));
    }


}
