import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(new BigDecimal("200.00"), "Suliya", "bran", LocalDateTime.now()));
        transactions.add(new Transaction(new BigDecimal("5000.00"), "Quayyum", "Eric", LocalDateTime.now()));

        Transaction.writeTransactions(transactions);
    }
}