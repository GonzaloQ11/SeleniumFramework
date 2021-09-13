package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage extends BasePage{
    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement signInButton;
    @FindBy(how = How.ID, using = "header_logo")
    private WebElement headerLogo;
    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchInput;

    public void assertSignInButtonDisplayed() {
        Assert.assertTrue(elementHelpers.weElementIsDisplayed(signInButton));
    }

    public AuthenticationPage clickOnSignInButton() {
        elementHelpers.weClick(signInButton);
        return instanceOf(AuthenticationPage.class);
    }
    public HomePage clickOnHomePage() {
        elementHelpers.weClick(headerLogo);
        return instanceOf(HomePage.class);
    }

    public void searchProduct(String name) {
        elementHelpers.weSendKeys(searchInput, name + Keys.RETURN, true);
    }
}
