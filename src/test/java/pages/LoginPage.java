package pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesforce() {
        driver.get(Urls.LOGIN);
        usernameInput.sendKeys(Credentials.USERNAME);
        passwordInput.sendKeys(Credentials.PASSWORD);
        loginButton.click();
    }
}
