import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest{
    BankMethod bank = new BankMethod();

    @Test
    public void testBankExists(){
        Assertions.assertTrue(true);
    }

    @Test
    public void testBankDeposit(){
        int balance = 0;
        int depositAmount = 100;
        int result = bank.deposit(balance, depositAmount);
        balance = 100;
        Assertions.assertEquals(balance, result);
        depositAmount = 500;
        result = bank.deposit(balance, depositAmount);
        balance = 600;
        Assertions.assertEquals(balance, result);
        depositAmount = 500;
        result = bank.deposit(balance, depositAmount);
        balance = 1100;
        Assertions.assertEquals(balance, result);
    }

    @Test
    public void testBankWithdraw(){
        int balance1 = 900;
        int withdrawalAmount = 100;
        int result = bank.withdraw(balance1, withdrawalAmount);
        balance1 = -800;
        Assertions.assertEquals(balance1, result);
        withdrawalAmount = 500;
        result = bank.withdraw(balance1, withdrawalAmount);
        balance1 = -300;
        Assertions.assertEquals(balance1, result);
    }

}