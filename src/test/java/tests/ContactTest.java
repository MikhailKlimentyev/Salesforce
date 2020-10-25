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
public class ContactTest extends BaseTest {

    private static final String USERNAME = "*****";
    private static final String PASSWORD = "*****";

    private Account account = Account.newBuilder()
            .setAccountName("Mikhail")
            .setWebSite("tut.by")
            .setType("Analyst")
            .setDescription("Description")
            .setBillingStreet("Billing Street")
            .build();

    @Test
    public void createContact() {
        loginSteps
                .login(USERNAME, PASSWORD);
        AccountSteps accountSteps = accountsSteps
                .openPage()
                .openNewAccountModal();
        accountSteps.
                createNewAccount(account);
    }
}
