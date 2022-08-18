package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {

    @FindBy(xpath = "//div[@title='New']")
    private WebElement newButton;


    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage() {
        driver.get(Urls.LOGIN.concat(Urls.ACCOUNTS));
        return this;
    }

    public NewAccountModalPage openNewAccountModal() {
        newButton.click();
        return new NewAccountModalPage(driver);
    }


}
