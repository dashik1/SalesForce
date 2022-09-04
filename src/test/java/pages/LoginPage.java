package pages;

import constants.Credentials;
import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Login to Salesforce")
    public void loginToSalesforce() {
        LOGGER.debug(String.format("Attempt to login to maim page: %s", Urls.LOGIN));
        driver.get(Urls.LOGIN);
        LOGGER.debug(String.format("Attempt to input username: %s", Credentials.USERNAME));
        usernameInput.sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Attempt to input password: %s", Credentials.PASSWORD));
        passwordInput.sendKeys(Credentials.PASSWORD);
        LOGGER.debug(String.format("Attempt to click to Login button: %s", loginButton));
        loginButton.click();
    }
}
