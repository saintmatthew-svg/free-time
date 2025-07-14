import java.util.*;

public class BankeBank {
    private final Map<String, Account> accounts = new HashMap<>();
    private final Random random = new Random();

    static class Account {
        String firstName;
        String lastName;
        String pin;
        String accountNumber;
        double balance;

        Account(String firstName, String lastName, String pin, String accountNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.pin = pin;
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }
    }

    public String showMenu() {
        return """
                \n===== BANKING SYSTEM MENU =====
                1. Create Account
                2. Close Account
                3. Deposit Money
                4. Withdraw Money
                5. Check Balance
                6. Transfer From one Account to another account
                7. Change PIN
                8. Exit
                """;
    }

    public String createAccount(String firstName, String lastName, String pin) {
        if (pin.length() != 4 || !pin.matches("\\d+")) {
            throw new IllegalArgumentException("PIN must be 4 digits");
        }

        String accountNumber;
        do {
            accountNumber = generateAccountNumber();
        } while (accounts.containsKey(accountNumber));

        Account newAccount = new Account(firstName, lastName, pin, accountNumber);
        accounts.put(accountNumber, newAccount);
        return String.format("Account created successfully!\nName: %s %s\nAccount Number: %s",
                firstName, lastName, accountNumber);
    }

    private String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder();
        for (int count = 0; count < 10; count++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }

    public void deposit(String accountNumber, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
        }

        Account account = getAccount(accountNumber);
        account.balance = account.balance + amount;
    }

    public void withdraw(String accountNumber, String pin, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        Account account = getAccount(accountNumber);
        validatePin(account, pin);

        if (account.balance < amount) {
            System.out.println("Insufficient funds");
        }

        account.balance -= amount;
    }

    public double checkBalance(String accountNumber, String pin) {
        Account account = getAccount(accountNumber);
        validatePin(account, pin);
        return account.balance;
    }

    public void transfer(String sourceAccountNumber, String targetAccountNumber, String pin, double amount) {
        withdraw(sourceAccountNumber, pin, amount);
        deposit(targetAccountNumber, amount);
    }

    public void changePin(String accountNumber, String oldPin, String newPin) {
        if (newPin.length() != 4 || !newPin.matches("\\d+")) {
            System.out.println("New PIN must be 4 digits");
        }

        Account account = getAccount(accountNumber);
        validatePin(account, oldPin);
        account.pin = newPin;
    }


    private Account getAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        return account;
    }

    private void validatePin(Account account, String pin) {
        if (!account.pin.equals(pin)) {
            throw new IllegalArgumentException("Invalid PIN");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankeBank bank = new BankeBank();
        boolean running = true;

        while (running) {
            System.out.println(bank.showMenu());
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter first name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Enter last name: ");
                        String lastName = scanner.nextLine();
                        System.out.print("Enter 4-digit PIN: ");
                        String pin = scanner.nextLine();
                        System.out.println(bank.createAccount(firstName, lastName, pin));
                    }
                    case 3 -> {
                        System.out.print("Enter account number: ");
                        String depositAccNum = scanner.nextLine();
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        bank.deposit(depositAccNum, depositAmount);
                        System.out.println("Deposit successful");
                    }
                    case 4 -> {
                        System.out.print("Enter account number: ");
                        String withdrawAccNum = scanner.nextLine();
                        System.out.print("Enter PIN: ");
                        String withdrawPin = scanner.nextLine();
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        bank.withdraw(withdrawAccNum, withdrawPin, withdrawAmount);
                        System.out.println("Withdrawal successful");
                    }
                    case 5 -> {
                        System.out.print("Enter account number: ");
                        String balanceAccNum = scanner.nextLine();
                        System.out.print("Enter PIN: ");
                        String balancePin = scanner.nextLine();
                        double balance = bank.checkBalance(balanceAccNum, balancePin);
                        System.out.printf("Current balance: $%.2f%n", balance);
                    }
                    case 6 -> {
                        System.out.print("Enter source account number: ");
                        String sourceAccNum = scanner.nextLine();
                        System.out.print("Enter target account number: ");
                        String targetAccNum = scanner.nextLine();
                        System.out.print("Enter PIN: ");
                        String transferPin = scanner.nextLine();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        scanner.nextLine();
                        bank.transfer(sourceAccNum, targetAccNum, transferPin, transferAmount);
                        System.out.println("Transfer successful");
                    }
                    case 7 -> {
                        System.out.print("Enter account number: ");
                        String changePinAccNum = scanner.nextLine();
                        System.out.print("Enter current PIN: ");
                        String oldPin = scanner.nextLine();
                        System.out.print("Enter new PIN: ");
                        String newPin = scanner.nextLine();
                        bank.changePin(changePinAccNum, oldPin, newPin);
                        System.out.println("PIN changed successfully");
                    }
                    case 8 -> {
                        running = false;
                        System.out.println("Thank you for using our banking system!");
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}