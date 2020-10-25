package pages;

import elements.DropDown;
import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.base.ModalBasePage;

public class AccountModal extends ModalBasePage {

    private static final By SAVE_BUTTON_LOCATOR = By.cssSelector("[title=Save]");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public AccountModal enterNewAccountFields(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());
        new DropDown(driver, "Type").select(account.getType());
        return this;
    }

    public AccountsPage clickSave() {
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
        return new AccountsPage(driver);
    }

    @Override
    public AccountModal isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON_LOCATOR));
        } catch (TimeoutException ex) {
            Assert.fail("Account Modal is not opened");
        } finally {
            return this;
        }
    }
}
