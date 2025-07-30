package Bank;

import Bank.BankTransaction;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @Test
    void testCanWriteTransaction() throws IOException {
        String filePath = "C:\\Users\\DELL\\Desktop\\BankTransaction\\test\\file";
        List<BankTransaction> transactions = new ArrayList<>();
        BankTransaction.saveTransaction(BigDecimal.valueOf(1000.00),"Suliha","Ibrahim");
        assertNotNull(filePath);
        assertFalse(filePath.isEmpty());
    }

    @Test
    void testCanReadTransaction() throws IOException {
        String filePath = "C:\\Users\\DELL\\Desktop\\BankTransaction\\test\\file\\transactions.txt";
        String transaction = BankTransaction.readTransaction(filePath);
        assertNotNull(transaction);
        assertFalse(transaction.isEmpty());
    }

    @Test
    void testToSerializeTransaction() throws IOException {
        BankTransaction transaction = new BankTransaction(BigDecimal.valueOf(1000.00), "Suliha", "Ibrahim");

        String expectedJson = "{\"amount\":1000.0,\"sender\":\"Suliha\",\"recipient\":\"Ibrahim\",\"date\":\"" + 2025 + "-" + 7 + "-" + 14 + "\"}";

        String json = BankTransaction.serialize(transaction);

        assertNotNull(json);
        assertEquals(expectedJson, json);
    }

    @Test
    void testShouldSerializeTransactions() {
        List<BankTransaction> transactions = new ArrayList<>();
        transactions.add(new BankTransaction(BigDecimal.valueOf(1000.00), "Suliha", "Ibrahim"));
        transactions.add(new BankTransaction(BigDecimal.valueOf(2000.00), "Ibrahim", "Suliha"));
        String expectedJson = "[{\"amount\":1000.0,\"sender\":\"Suliha\",\"recipient\":\"Ibrahim\",\"date\":\"" + 2025 + "-" + 7 + "-" + 14 + "\"}," +
                "{\"amount\":2000.0,\"sender\":\"Ibrahim\",\"recipient\":\"Suliha\",\"date\":\"" + 2025 + "-" + 7 + "-" + 14 + "\"}]";
        String actualJson = BankTransaction.serializeTransactions(transactions);
        assertNotNull(actualJson);
        assertEquals(expectedJson, actualJson);
    }

    @Test
    void testShouldDeserializeTransactions() {
        String json = "{\"amount\":1000.0,\"sender\":\"Suliha\",\"recipient\":\"Ibrahim\",\"date\":\"" + 2025 + "-" + 7 + "-" + 14 + "\"}" ;
        BankTransaction transaction = BankTransaction.deserialize(json);
        assertNotNull(transaction);
        assertEquals("Ibrahim",transaction.getRecipient());
        assertEquals("Suliha",transaction.getSender());
        assertEquals(BigDecimal.valueOf(1000.00),transaction.getAmount());
        assertEquals(LocalDate.of(2025, Month.JULY,14),transaction.getDate());
    }

}
