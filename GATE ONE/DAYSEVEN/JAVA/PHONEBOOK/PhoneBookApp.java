import java.util.ArrayList;

public class PhoneBookApp {
    private ArrayList<PhoneBook> contacts = new ArrayList<>();

    public String addContacts(String firstName, String lastName, String phoneNumber) {
        PhoneBook newContact = new PhoneBook(firstName, lastName, phoneNumber);
        String newPhoneContact = firstName + " " + lastName + " " + phoneNumber;
        contacts.add(newContact);
        return newPhoneContact;
    }

    public String removeContact(String firstName, String lastName, String phoneNumber) {
        for(PhoneBook contact : contacts) {
            if (contact.getFirstName().equals(firstName) || contact.getLastName().equals(lastName) || contact.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(contact);
                return "Contact removed";
            }
        }
        return "contact not found";
    }

    public String findNumberWithNumber(String phoneNumber) {
        for (PhoneBook contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber();
            }
        }
        return "Contact not found";
    }

    public String findNumberWithFirstName(String firstName) {
        for (PhoneBook contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                return contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber();
            }
        }
        return "Contact not found";
    }

    public String findNumberWithLastName(String lastName) {
        for (PhoneBook contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber();
            }
        }
        return "Contact not found";
    }

    public String editContact(String firstName, String lastName, String newPhoneNumber) {
        for (PhoneBook contact : contacts) {
            if (contact.getFirstName().equals(firstName) || contact.getLastName().equals(lastName) || contact.getPhoneNumber().equals(newPhoneNumber)) {
                contact.setPhoneNumber(newPhoneNumber);
                return "Contact edited";
            }
        }
        return "Contact not found";
    }

}