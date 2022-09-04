package pages;

import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());

    @FindBy(xpath = "//div[@title='New']")
    private WebElement newButton;


    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage() {
        LOGGER.debug(String.format("Attempt to open Account page by url: %s", Urls.LOGIN.concat(Urls.ACCOUNTS)));
        driver.get(Urls.LOGIN.concat(Urls.ACCOUNTS));
        return this;
    }

    public NewAccountModalPage openNewAccountModal() {
        LOGGER.debug(String.format("Attempt to click to %s button", newButton));
        newButton.click();
        return new NewAccountModalPage(driver);
    }


}
