package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.base.BasePage;

public class ContactsPage extends BasePage {

    private static final String URL = "https://epam4.lightning.force.com/lightning/o/Contact/list?filterName=Recent";

    private static final By NEW_BUTTON_LOCATOR = By.cssSelector("[title=New][role=button]");
    private static final By CONTACTS_IMAGE_LOCATOR = By.cssSelector("img[title='Contacts']");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public ContactModal clickNew() {
        driver.findElement(NEW_BUTTON_LOCATOR).click();
        return new ContactModal(driver);
    }

    @Override
    public ContactsPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(CONTACTS_IMAGE_LOCATOR));
        } catch (TimeoutException ex) {
            Assert.fail("Contacts Page is not opened");
        } finally {
            return this;
        }
    }

    @Override
    public ContactsPage openPage() {
        driver.get(URL);
        return this;
    }
}
