package pages;

import static utils.selenium.Driver.browser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.helpers.WebDriverHelpers;
import utils.helpers.WebElementsHelpers;
import utils.selenium.Settings;
import org.testng.Assert;

public class BasePage extends Page {

    @FindBy(id = "search_form_input_homepage")
    public WebElement searchField;
    public WebDriver driver = browser();
    protected WebElementsHelpers elementHelpers = new WebElementsHelpers();
    protected WebDriverHelpers driverHelpers = new WebDriverHelpers();
    private String getTitle() { return driver.getTitle(); }
    private String getUrl() {return driver.getCurrentUrl(); }
    private String getPageSource() {return driver.getPageSource(); }

    public void navigateToBaseUrl() {
        String baseUrl = Settings.baseUrl;
        browser().navigate().to(baseUrl);
        System.out.println("Welcome to Product - Selenium Automation Framework");
    }

    public void validatePageTitle(String expectedTitle) {
        Assert.assertEquals(getTitle(), expectedTitle);
        // Assert.assertTrue(.contains());
        System.out.println(":: The title of the site is: " + getTitle());
    }

    public void validatePageUrl(String expectedUrl) {
        Assert.assertTrue(getUrl().contains(expectedUrl));
        System.out.println(":: The page Url is: " + getUrl());
    }

    public void validatePageSource(String expectedPageSource) {
        Assert.assertTrue(getPageSource().contains(expectedPageSource));
        System.out.println(":: The page source is: " + getPageSource());
    }
}