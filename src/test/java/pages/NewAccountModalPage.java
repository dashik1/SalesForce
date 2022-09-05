package pages;

import elements.DropdownList;
import elements.TextArea;
import elements.TextInput;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModalPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(NewAccountModalPage.class.getName());

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input")
    private WebElement accountNameInput;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title='Save']")
    private WebElement saveButton;


    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount) {
        LOGGER.debug("Attempt to fill in all inputs on the New Account modal page");
        accountNameInput.sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new TextArea(driver, "Billing Street").inputTextArea(newAccount.getBillingStreet());
        new TextArea(driver, "Shipping Street").inputTextArea(newAccount.getShippingStreet());
        new TextArea(driver, "Description").inputTextArea(newAccount.getDescription());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingState());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipCode());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingState());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZipCode());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());
        LOGGER.debug(String.format("Attempt to click %s button", saveButton));
        saveButton.click();
    }
}
