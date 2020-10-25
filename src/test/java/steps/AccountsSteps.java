package steps;

import pages.AccountModal;
import pages.AccountsPage;

public class AccountsSteps {

    private AccountsPage accountsPage;

    public AccountsSteps(AccountsPage accountsPage) {
        this.accountsPage = accountsPage;
    }

    public AccountsSteps openPage() {
        accountsPage
                .openPage()
                .isPageOpened();
        return this;
    }

    public AccountSteps openNewAccountModal() {
        AccountModal accountModal = accountsPage
                .clickNew()
                .isPageOpened();
        return new AccountSteps(accountModal, accountsPage);
    }
}
