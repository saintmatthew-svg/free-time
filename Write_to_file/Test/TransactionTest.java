import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void testCanWriteToFile() throws Exception {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new BigDecimal("200.00"), "Suliya", "bran", LocalDateTime.now()));
        transactions.add(new Transaction(new BigDecimal("5000.00"), "Quayyum", "Eric", LocalDateTime.now()));
        Path filePath = Path.of("transactions.txt");
        Transaction.writeTransactions(transactions);
        assertTrue(Files.exists(filePath), "File should exist");
        assertTrue(Files.size(filePath) > 0, "File should not be empty");
        String content = Files.readString(filePath);
        assertTrue(content.contains("Suliya"), "File should contain sender name");
        assertTrue(content.contains("200.00"), "File should contain amount");
    }
}