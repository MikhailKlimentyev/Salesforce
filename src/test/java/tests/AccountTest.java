package tests;

import models.Account;
import org.testng.annotations.Test;
import steps.AccountSteps;

/*
        1. Создать класс TextArea и имплементировать его
        2. Заполнить все поля при создании аккаунта
        3. Заполнить все поля при создании КОНТАКТА
        4. Отрефакторить проект под корректный PageObject и другие паттерны по желанию (BaseTest и ожидания)
 */
public class AccountTest extends BaseTest {

    private static final String USERNAME = "*****";
    private static final String PASSWORD = "*****";

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
                .login(USERNAME, PASSWORD);
        AccountSteps accountSteps = accountsSteps
                .openPage()
                .openNewAccountModal();
        accountSteps.
                createNewAccount(account);
    }
}
