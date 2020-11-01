package steps;

import io.qameta.allure.Step;
import pages.AccountModal;
import pages.AccountsPage;

public class AccountsSteps {

    private AccountsPage accountsPage;

    public AccountsSteps(AccountsPage accountsPage) {
        this.accountsPage = accountsPage;
    }

    @Step("Open accounts page")
    public AccountsSteps openPage() {
        accountsPage
                .openPage()
                .isPageOpened();
        return this;
    }

    @Step("Open new account modal")
    public AccountSteps openNewAccountModal() {
        AccountModal accountModal = accountsPage
                .clickNew()
                .isPageOpened();
        return new AccountSteps(accountModal, accountsPage);
    }
}
