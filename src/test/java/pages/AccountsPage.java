package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.base.BasePage;

public class AccountsPage extends BasePage {

    private static final String URL = "https://epam4.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    private static final By NEW_BUTTON_LOCATOR = By.cssSelector("[title=New]");
    private static final By ACCOUNT_NAME_LABEL_LOCATOR = By.cssSelector("[title=Account Name]");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountModal clickNew() {
        driver.findElement(NEW_BUTTON_LOCATOR).click();
        return new AccountModal(driver);
    }

    @Override
    public AccountsPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_NAME_LABEL_LOCATOR));
        } catch (TimeoutException ex) {
            Assert.fail("Accounts Page is not opened");
        } finally {
            return this;
        }
    }

    @Override
    public AccountsPage openPage() {
        driver.get(URL);
        return this;
    }
}
