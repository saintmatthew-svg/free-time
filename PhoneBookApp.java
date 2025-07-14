import java.util.ArrayList;

public class PhoneBookApp {
    private ArrayList<PhoneBook> contacts = new ArrayList<>();

    private void validateName(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Name cannot contain numbers: " + name);
        }
    }

    private void validatePhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty");
        }
        if (!phoneNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Phone number must contain only digits: " + phoneNumber);
        }
    }

    public String addContacts(String firstName, String lastName, String phoneNumber) throws IllegalArgumentException {
        validateName(firstName);
        validateName(lastName);
        validatePhoneNumber(phoneNumber);

        PhoneBook newContact = new PhoneBook(firstName, lastName, phoneNumber);
        String newPhoneContact = firstName + " " + lastName + " " + phoneNumber;
        contacts.add(newContact);
        return newPhoneContact;
    }

    public String removeContact(String firstName, String lastName, String phoneNumber)
            throws IllegalArgumentException {
        if ((firstName == null || firstName.trim().isEmpty()) &&
                (lastName == null || lastName.trim().isEmpty()) &&
                (phoneNumber == null || phoneNumber.trim().isEmpty())) {
            throw new IllegalArgumentException("At least one identifier (first name, last name or phone number) must be provided");
        }

        if (firstName != null && !firstName.trim().isEmpty()) validateName(firstName);
        if (lastName != null && !lastName.trim().isEmpty()) validateName(lastName);
        if (phoneNumber != null && !phoneNumber.trim().isEmpty()) validatePhoneNumber(phoneNumber);

        for (PhoneBook contact : contacts) {
            if ((firstName == null || firstName.equals(contact.getFirstName())) &&
                    (lastName == null || lastName.equals(contact.getLastName())) &&
                    (phoneNumber == null || phoneNumber.equals(contact.getPhoneNumber()))) {
                contacts.remove(contact);
                return "Contact removed";
            }
        }
        throw new IllegalArgumentException("Contact not found");
    }

    public String findNumberWithNumber(String phoneNumber) throws IllegalArgumentException {
        validatePhoneNumber(phoneNumber);

        for (PhoneBook contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber();
            }
        }
        throw new IllegalArgumentException("Contact not found with phone number: " + phoneNumber);
    }

    public String findNumberWithFirstName(String firstName) throws IllegalArgumentException {
        validateName(firstName);

        for (PhoneBook contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                return contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber();
            }
        }
        throw new IllegalArgumentException("Contact not found with first name: " + firstName);
    }

    public String findNumberWithLastName(String lastName) throws IllegalArgumentException {
        validateName(lastName);

        for (PhoneBook contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return contact.getFirstName() + " " + contact.getLastName() + "  " + contact.getPhoneNumber();
            }
        }
        throw new IllegalArgumentException("Contact not found with last name: " + lastName);
    }

    public String editContact(String firstName, String lastName, String newPhoneNumber) throws IllegalArgumentException {
        if ((firstName == null || firstName.trim().isEmpty()) && (lastName == null || lastName.trim().isEmpty())) {
            throw new IllegalArgumentException("At least one identifier (first name or last name) must be provided");
        }

        if (firstName != null && !firstName.trim().isEmpty()) validateName(firstName);
        if (lastName != null && !lastName.trim().isEmpty()) validateName(lastName);
        validatePhoneNumber(newPhoneNumber);

        for (PhoneBook contact : contacts) {
            if ((firstName == null || contact.getFirstName().equals(firstName)) && (lastName == null || contact.getLastName().equals(lastName))) {
                contact.setPhoneNumber(newPhoneNumber);
                return "Contact edited successfully";
            }
        }
        throw new IllegalArgumentException("Contact not found");
    }
}