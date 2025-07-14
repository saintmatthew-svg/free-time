public class Account {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String pin;
    private int balance;

    Account(String firstName, String lastName, String phoneNumber, String pin, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPin(String pin) {this.pin = pin;}
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPin() { return pin; }
    public int getBalance() {
        return balance;
    }

}