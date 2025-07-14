public class BankMethod {

    AccountMethod method = new AccountMethod();
    public int deposit(int depositAmount, int balance) {
        balance = balance + depositAmount;
        return balance;
    }

    public int withdraw(int withdrawAmount, int balance) {
        balance = balance - withdrawAmount;
        return balance;
    }

}