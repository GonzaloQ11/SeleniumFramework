package utils.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.selenium.Driver.browser;

public class WebElementsHelpers {
    private int sec = 10;
    public String weHighlightedColour = "arguments[0].style.border='5px solid blue'";

    public WebDriverWait weWaitForSeconds() {
        WebDriverWait wait = new WebDriverWait(browser(), sec);
        return wait;
    }

    public boolean weElementIsDisplayed(WebElement element) {
        weWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public boolean weElementToBeClickable(WebElement element) {
        weWaitForSeconds().until(ExpectedConditions.elementToBeClickable(element));
        return element.isEnabled();
    }

    public void weHighlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser();
        js.executeScript(weHighlightedColour, element);
    }

    public void weClick(WebElement element) {
        weElementToBeClickable(element);
        weHighlightElement(element);
        element.click();
    }

    public void weSendKeys(WebElement element, String text, boolean clearFirst) {
        weElementIsDisplayed(element);
        if (clearFirst) weClick(element);
        element.sendKeys(text);
    }

    public boolean weElementIsInvisible(WebElement element) {
        weWaitForSeconds().until(ExpectedConditions.invisibilityOf(element));
        return !element.isDisplayed();
    }

    public String weGetAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }
}
