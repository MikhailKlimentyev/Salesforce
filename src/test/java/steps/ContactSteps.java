package steps;

import models.Contact;
import pages.ContactModal;
import pages.ContactsPage;

public class ContactSteps {

    private ContactModal contactModal;
    private ContactsPage contactsPage;

    public ContactSteps(ContactModal contactModal, ContactsPage contactsPage) {
        this.contactModal = contactModal;
        this.contactsPage = contactsPage;
    }

    public ContactsSteps createNewAccount(Contact contact) {
        contactModal
                .enterNewContactFields(contact)
                .clickSave();
        return new ContactsSteps(contactsPage);
    }
}
