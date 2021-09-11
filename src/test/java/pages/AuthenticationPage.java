package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

public class AuthenticationPage extends BasePage{
    @FindBy(how = How.ID, using = "email")
    public WebElement emailInput;
    @FindBy(how = How.ID, using = "passwd")
    public WebElement passwordInput;
    @FindBy(how = How.ID, using = "SubmitLogin")
    public WebElement signInSubmitButton;
    @FindBy(how = How.CSS, using = ".alert-danger li")
    public WebElement errorMessageText;

    public void assertSignInSubmitButtonDisplayed() {
        Assert.assertTrue(elementHelpers.weElementIsDisplayed(signInSubmitButton));
    }

    public void enterEmail(String email) {
        elementHelpers.weSendKeys(emailInput, email, true);
    }

    public void enterPassword(String password) {
        elementHelpers.weSendKeys(passwordInput, password, true);
    }
    public void clickOnSubmitSignInButton() {
        elementHelpers.weClick(signInSubmitButton);
    }

    public void assertErrorMessage(String errorMessage) {
        Assert.assertEquals(elementHelpers.weGetAttribute(errorMessageText, "textContent"), errorMessage);
    }
}
