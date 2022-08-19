package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LastCreatedAccountPage extends BasePage {

    @FindBy(xpath = "//lightning-formatted-text[@class='custom-truncate']")
    private WebElement lastCreatedAccountName;

    public LastCreatedAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getLastCreatedAccountName() {
        return lastCreatedAccountName.getAttribute("value");
    }

}

