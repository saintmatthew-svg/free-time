import java.util.Scanner;

public class PhoneBookMain {
    public static String displayMenu() {
        return """
                \n1. Add contact
                2. Remove contact
                3. Find contact by phone number
                4. Find contact by first name
                5. Find contact by last name
                6. Edit contact
                7. Exit
                """;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBookApp mainApp = new PhoneBookApp();

        while (true) {
            System.out.println(displayMenu());
            System.out.println("Enter your choice (1 - 7): ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name: ");
                    String firstName = input.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = input.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = input.nextLine();
                    String addedContact = mainApp.addContacts(firstName, lastName, phoneNumber);
                    System.out.println("Contact added: " + addedContact);
                    break;

                case 2:
                    System.out.println("Enter first name (enter to skip): ");
                    firstName = input.nextLine();
                    System.out.println("Enter last name (enter to skip): ");
                    lastName = input.nextLine();
                    System.out.println("Enter phone number (enter to skip): ");
                    phoneNumber = input.nextLine();
                    String removedContact = mainApp.removeContact(firstName, lastName, phoneNumber);
                    System.out.println(removedContact);
                    break;

                case 3:
                    System.out.println("Enter phone number: ");
                    phoneNumber = input.nextLine();
                    String foundNumber = mainApp.findNumberWithNumber(phoneNumber);
                    System.out.println("Result: " + foundNumber);
                    break;

                case 4:
                    System.out.println("Enter first name: ");
                    firstName = input.nextLine();
                    String foundByFirstName = mainApp.findNumberWithFirstName(firstName);
                    System.out.println("Result: " + foundByFirstName);
                    break;

                case 5:
                    System.out.println("Enter last name: ");
                    lastName = input.nextLine();
                    String foundByLastName = mainApp.findNumberWithLastName(lastName);
                    System.out.println("Result: " + foundByLastName);
                    break;

                case 6:
                    System.out.println("Enter first name: ");
                    firstName = input.nextLine();
                    System.out.println("Enter last name: ");
                    lastName = input.nextLine();
                    System.out.println("Enter new phone number: ");
                    phoneNumber = input.nextLine();
                    String editedContact = mainApp.editContact(firstName, lastName, phoneNumber);
                    System.out.println(editedContact);
                    break;

                case 7:
                    System.out.println("Exiting the phone book. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}