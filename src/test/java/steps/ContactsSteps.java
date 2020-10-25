package steps;

import pages.ContactModal;
import pages.ContactsPage;

public class ContactsSteps {

    private ContactsPage contactsPage;

    public ContactsSteps(ContactsPage contactsPage) {
        this.contactsPage = contactsPage;
    }

    public ContactsSteps openPage() {
        contactsPage
                .openPage()
                .isPageOpened();
        return this;
    }

    public ContactSteps openNewContactModal() {
        ContactModal contactModal = contactsPage
                .clickNew()
                .isPageOpened();
        return new ContactSteps(contactModal, contactsPage);
    }
}
