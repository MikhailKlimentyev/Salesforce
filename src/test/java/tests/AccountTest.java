package tests;

import models.Account;
import org.testng.annotations.Test;
import steps.AccountSteps;

public class AccountTest extends BaseTest {

    private Account account = Account.newBuilder()
            .setAccountName("Mikhail")
            .setWebSite("tut.by")
            .setParentAccount("Some parent account")
            .setPhone("Some phone")
            .setEmployees(5)
            .setBillingCity("Some billing city")
            .setBillingStateProvince("Some Billing State/Province")
            .setBillingZipPostalCode("Some Billing Zip/Postal Code")
            .setBillingCountry("Some Billing Country")
            .setShippingCity("Some Shipping City")
            .setShippingStateProvince("Some Shipping State/Province")
            .setShippingZipPostalCode("Some Shipping Zip/Postal Code")
            .setShippingCountry("Some Shipping Country")
            .setType("Analyst")
            .setDescription("Some description")
            .setBillingStreet("Some Billing Street")
            .setIndustry("Technology")
            .setShippingStreet("Some Shipping Street")
            .build();

    @Test
    public void createAccount() {
        loginSteps
                .login(getEnvOrReadProperty("User"), getEnvOrReadProperty("Pass"));
        AccountSteps accountSteps = accountsSteps
                .openPage()
                .openNewAccountModal();
        accountSteps.
                createNewAccount(account);
    }
}
