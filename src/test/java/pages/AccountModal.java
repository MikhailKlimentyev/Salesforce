package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
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
        new Input(driver, "Parent Account").write(account.getParentAccount());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Employees").write(String.valueOf(account.getEmployees()));
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getBillingZipPostalCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new DropDown(driver, "Type").select(account.getType());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
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
