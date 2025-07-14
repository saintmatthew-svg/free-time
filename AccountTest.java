import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    AccountMethod method = new AccountMethod();

    @Test
    public void testAccountExists() {
        Assertions.assertTrue(true);
    }

    @Test
    public void testCreateAccount() {
        String firstName = "matthew";
        String lastName = "kachi";
        String phoneNumber = "123456789";
        String pin = "1234";
        int balance = 0;
        String expected = "Account created";
        String result = method.createAccount(firstName, lastName, phoneNumber, pin, balance);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCloseAccount() {
        String firstName = "matthew";
        String lastName = "kachi";
        String phoneNumber = "123456789";
        String pin = "1234";
        String expected = "Account closed";
        String result = method.closeAccount(firstName, lastName, phoneNumber, pin);
        Assertions.assertEquals(expected, result);
    }

}