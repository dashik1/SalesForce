package tests;

import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LastCreatedAccountPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info(String.format("Page %s initialized", AccountsPage.class.getName()));
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountsPage()
                .openNewAccountModal()
                .fillInAccountForm(accountModel);

        LastCreatedAccountPage lastCreatedAccountPage = new LastCreatedAccountPage(driver);
        LOGGER.info(String.format("Page %s initialized", LastCreatedAccountPage.class.getName()));
        Assert.assertEquals(accountModel.getAccountName(), lastCreatedAccountPage.getLastCreatedAccountName());

    }
}
