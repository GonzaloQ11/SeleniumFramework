package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPage extends BasePage{
    @FindBy(how = How.CLASS_NAME, using = "product-container")
    private WebElement productBox;
    
    public ProductPage clickOnProduct() {
        elementHelpers.weClick(productBox);
        return instanceOf(ProductPage.class);
    }
}
