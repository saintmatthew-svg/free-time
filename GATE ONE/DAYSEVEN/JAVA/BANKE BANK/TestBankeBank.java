import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBankeBank {
    private BankeBank bank;

    @BeforeEach
    public void setUp() {
        bank = new BankeBank();
    }

    @Test
    public void testCreateAccount() {
        String result = bank.createAccount("John", "Doe", "1234");
        assertTrue(result.contains("Account created successfully"));
        assertTrue(result.contains("John Doe"));
    }

    @Test
    public void testCreateAccountWithInvalidPin() {
        assertThrows(IllegalArgumentException.class, () ->
                bank.createAccount("John", "Doe", "123"));
        assertThrows(IllegalArgumentException.class, () ->
                bank.createAccount("John", "Doe", "abcd"));
    }

    @Test
    public void testDepositMoney() {
        String accountNumber = createTestAccount();
        bank.deposit(accountNumber, 100.0);
        assertEquals(100.0, bank.checkBalance(accountNumber, "1234"));
    }

    @Test
    public void testDepositNegativeAmount() {
        String accountNumber = createTestAccount();
        assertThrows(IllegalArgumentException.class, () ->
                bank.deposit(accountNumber, -50.0));
    }

    @Test
    public void testWithdrawMoney() {
        String accountNumber = createTestAccount();
        bank.deposit(accountNumber, 200.0);
        bank.withdraw(accountNumber, "1234", 50.0);
        assertEquals(150.0, bank.checkBalance(accountNumber, "1234"));
    }

    @Test
    public void testWithdrawWithInsufficientFunds() {
        String accountNumber = createTestAccount();
        bank.deposit(accountNumber, 50.0);
        assertThrows(IllegalStateException.class, () ->
                bank.withdraw(accountNumber, "1234", 100.0));
    }

    @Test
    public void testWithdrawWithWrongPin() {
        String accountNumber = createTestAccount();
        bank.deposit(accountNumber, 100.0);
        assertThrows(IllegalArgumentException.class, () ->
                bank.withdraw(accountNumber, "9999", 50.0));
    }

    @Test
    public void testTransferMoney() {
        String acc1 = createTestAccount("John", "Doe", "1111");
        String acc2 = createTestAccount("Jane", "Smith", "2222");

        bank.deposit(acc1, 300.0);
        bank.transfer(acc1, acc2, "1111", 150.0);

        assertEquals(150.0, bank.checkBalance(acc1, "1111"));
        assertEquals(150.0, bank.checkBalance(acc2, "2222"));
    }

    @Test
    public void testChangePin() {
        String accountNumber = createTestAccount();
        bank.changePin(accountNumber, "1234", "5678");
        bank.deposit(accountNumber, 100.0);
        assertEquals(100.0, bank.checkBalance(accountNumber, "5678"));
        assertThrows(IllegalArgumentException.class, () ->
                bank.checkBalance(accountNumber, "1234"));
    }


    private String createTestAccount() {
        return createTestAccount("Test", "User", "1234");
    }

    private String createTestAccount(String firstName, String lastName, String pin) {
        String result = bank.createAccount(firstName, lastName, pin);
        return result.substring(result.lastIndexOf(" ") + 1);
    }
}