import java.util.ArrayList;

public class AccountMethod {

    ArrayList<Account> accounts = new ArrayList<>();

    public String createAccount(String firstName, String lastName, String phoneNumber, String pin, int balance) {
        Account newAccount = new Account(firstName, lastName, phoneNumber, pin, balance);
        accounts.add(newAccount);
        System.out.println(newAccount);
        return "Account created";
    }

    public String closeAccount(String firstName, String lastName, String phoneNumber, String pin) {
        accounts.removeIf(account -> firstName.equals(account.getFirstName()) && lastName.equals(account.getLastName())&& phoneNumber.equals(account.getPhoneNumber()) && pin.equals(account.getPin()));
        return "Account closed";
    }

}