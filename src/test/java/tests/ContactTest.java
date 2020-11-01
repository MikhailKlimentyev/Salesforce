package tests;

import models.Contact;
import org.testng.annotations.Test;
import steps.ContactSteps;


public class ContactTest extends BaseTest {

    private Contact contact = Contact.newBuilder()
            .setSalutation("Dr.")
            .setMailingStreet("Some Mailing Street")
            .setFirstName("Ivan")
            .setMiddleName("Ivanovich")
            .setLastName("Johnson")
            .setSuffix("er")
            .setAccountName("Mikhail")
            .setReportsTo("Some Reports To")
            .setTitle("Some Title")
            .setEmail("email@gmail.com")
            .setPhone("Some Phone")
            .setMobile("Some Mobile")
            .setDepartment("Some Department")
            .setFax("Some Fax")
            .setMailingCity("Some Mailing City")
            .setMailingStateProvince("Some Mailing State/Province")
            .setMailingZipPostalCode("Some Mailing Zip/Postal Code")
            .setMailingCountry("Some Mailing Country")
            .build();

    @Test
    public void createContact() {
        loginSteps
                .login(getEnvOrReadProperty("User"), getEnvOrReadProperty("Pass"));
        ContactSteps contactSteps = contactsSteps
                .openPage()
                .openNewContactModal();
        contactSteps.
                createNewContact(contact);
    }
}
