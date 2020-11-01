package steps;

import io.qameta.allure.Step;
import pages.ContactModal;
import pages.ContactsPage;

public class ContactsSteps {

    private ContactsPage contactsPage;

    public ContactsSteps(ContactsPage contactsPage) {
        this.contactsPage = contactsPage;
    }

    @Step("Open contacts page")
    public ContactsSteps openPage() {
        contactsPage
                .openPage()
                .isPageOpened();
        return this;
    }

    @Step("Open new contact modal")
    public ContactSteps openNewContactModal() {
        ContactModal contactModal = contactsPage
                .clickNew()
                .isPageOpened();
        return new ContactSteps(contactModal, contactsPage);
    }
}
