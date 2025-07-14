import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Transaction {
    private BigDecimal amount;
    private String recipient;
    private String sender;
    private LocalDateTime date;

    public Transaction(BigDecimal amount, String sender, String recipient, LocalDateTime date) {
        this.amount = amount;
        this.sender = sender;
        this.recipient = recipient;
        this.date = date;
    }

    static Path folderPath = Path.of("C:\\Users\\Dell\\IdeaProjects\\Write_to_file\\");
    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void writeTransactions(List<Transaction> transactions) {
        String filePath = "transactions.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (Transaction transaction : transactions) {
                String formatted = String.format("Amount: %.2f Date: %s Sender: %s Recipient: %s:",
                        transaction.amount,
                        transaction.date.format(dateFormatter),
                        transaction.sender,
                        transaction.recipient);
                writer.write(formatted);
                writer.newLine();
            }
            System.out.println(" transactions written to file successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}