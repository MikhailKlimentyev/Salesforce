package pages;

import elements.ComboBox;
import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.base.ModalBasePage;

public class ContactModal extends ModalBasePage {

    private static final By SAVE_BUTTON_LOCATOR = By.cssSelector("[title=Save]");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    public ContactModal enterNewContactFields(Contact contact) {
        new DropDown(driver, "Salutation").select(contact.getSalutation());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new Input(driver, "Reports To").write(contact.getReportsTo());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new ComboBox(driver, "Account Name").writeSelect(contact.getAccountName());
        return this;
    }

    public ContactsPage clickSave() {
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
        return new ContactsPage(driver);
    }

    @Override
    public ContactModal isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON_LOCATOR));
        } catch (TimeoutException ex) {
            Assert.fail("Contact Modal is not opened");
        } finally {
            return this;
        }
    }
}
