package steps;

import models.Account;
import pages.AccountModal;
import pages.AccountsPage;

public class AccountSteps {

    private AccountModal accountModal;
    private AccountsPage accountsPage;

    public AccountSteps(AccountModal accountModal, AccountsPage accountsPage) {
        this.accountModal = accountModal;
        this.accountsPage = accountsPage;
    }

    public AccountsSteps createNewAccount(Account account) {
        accountModal
                .enterNewAccountFields(account)
                .clickSave();
        return new AccountsSteps(accountsPage);
    }
}
