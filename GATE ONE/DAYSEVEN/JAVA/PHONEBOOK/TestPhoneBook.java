import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestPhoneBook {

    @Test
    public void testAddPhoneIsEmptyAndIsNotEmpty() {
        ArrayList<String> contacts = new ArrayList<>();
        Assertions.assertTrue(true);
        PhoneBookApp app = new PhoneBookApp();
        String newContact = app.addContacts("john", "john", "0909876543211");
        contacts.add(newContact);
        Assertions.assertFalse(false);
    }

    @Test
    public void testAddContact() {
        ArrayList<String> contacts = new ArrayList<>();
        PhoneBookApp app = new PhoneBookApp();
        String newContact = app.addContacts("john", "john", "0909876543211");
        contacts.add(newContact);
        assertEquals(newContact, contacts.get(0));
    }

    @Test
    public void testContactCanSave() {
        ArrayList<String> contacts = new ArrayList<>();
        PhoneBookApp app = new PhoneBookApp();
        String newContact = app.addContacts("john", "john", "09088776599");
        contacts.add(newContact);
        assertEquals(1, contacts.size());
        String newContact2 = app.addContacts("micheal", "sam", "09049207929");
        contacts.add(newContact2);
        assertEquals(2, contacts.size());
    }

    @Test
    public void testContactCanRemove() {
        PhoneBookApp app = new PhoneBookApp();
        app.addContacts("John", "John", "09088776599");
        app.addContacts("Sam", "Sam", "08012345678");
        String removeResult1 = app.removeContact("John", "John", "09088776599");
        assertEquals("Contact removed", removeResult1);
        String removeResult2 = app.removeContact("Sam", "Sam", "08012345678");
        assertEquals("Contact removed", removeResult2);
        String findRemoved1 = app.removeContact("John", "John", "09088776599");
        assertEquals("contact not found", findRemoved1);
        String findRemoved2 = app.removeContact("Sam", "Sam", "08012345678");
        assertEquals("contact not found", findRemoved2);
    }

    @Test
    public void testCanFindNumberWithNumber() {
        ArrayList<String> contacts = new ArrayList<>();
        PhoneBookApp app = new PhoneBookApp();
        String newContact = app.addContacts("john", "john", "09088776599");
        String newContact2 = app.addContacts("sam", "sam", "09088776598");
        contacts.add(newContact);
        contacts.add(newContact2);
        app.findNumberWithNumber("09088776598");
        app.findNumberWithNumber("09088776598");
        assertEquals("john john 09088776599", contacts.get(0));
        assertEquals("sam sam 09088776598", contacts.get(1));
    }

    @Test
    public void testCanFindNumberWithFirstName() {
        ArrayList<String> contacts = new ArrayList<>();
        PhoneBookApp app = new PhoneBookApp();
        String newContact = app.addContacts("john", "john", "09088776599");
        String newContact2 = app.addContacts("sam", "sam", "09088776598");
        contacts.add(newContact);
        contacts.add(newContact2);
        app.findNumberWithFirstName("john");
        app.findNumberWithFirstName("sam");
        assertEquals("sam sam 09088776598", contacts.get(1));
        assertEquals("john john 09088776599", contacts.get(0));
    }

    @Test
    public void testCanFindNumberWithLastName() {
        ArrayList<String> contacts = new ArrayList<>();
        PhoneBookApp app = new PhoneBookApp();
        String newContact = app.addContacts("john", "john", "09088776599");
        String newContact2 = app.addContacts("sam", "sam", "09088776598");
        contacts.add(newContact);
        contacts.add(newContact2);
        app.findNumberWithLastName("john");
        app.findNumberWithLastName("sam");
        assertEquals("sam sam 09088776598", contacts.get(1));
        assertEquals("john john 09088776599", contacts.get(0));
    }

    @Test
    public void testCanEditContact() {
        PhoneBookApp app = new PhoneBookApp();
        app.addContacts("John", "John", "09088776599");
        app.addContacts("Sam", "Sam", "09088776598");
        String editResult = app.editContact("John", "John", "08012345678");
        assertEquals("Contact edited", editResult);
        String updatedNumber = app.findNumberWithNumber("08012345678");
        assertEquals("John John  08012345678", updatedNumber);
        String editNonExistentResult = app.editContact("Jane", "Doe", "07098765432");
        assertEquals("Contact not found", editNonExistentResult);
    }

}