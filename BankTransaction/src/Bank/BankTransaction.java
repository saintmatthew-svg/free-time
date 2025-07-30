package Bank;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankTransaction {
    private BigDecimal amount;
    private String sender;
    private String recipient;
    @JsonSerialize(using = TransactionDateSerializer.class)
    @JsonDeserialize(using = TransactionDateDeSerializer.class )
    private LocalDate date;

    public BankTransaction() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BankTransaction(BigDecimal amount, String sender, String recipient) {
        this.amount = amount;
        this.sender = sender;
        this.recipient = recipient;
        this.date = LocalDate.now();
    }

    public static void saveTransaction(BigDecimal amount,String sender,String recipient) throws IOException {
        BankTransaction transaction = new BankTransaction(amount, sender, recipient);
        List<String> transactions = new ArrayList<>();
        transactions.add(transaction.toString());

        Path path = Paths.get("C:\\Users\\DELL\\Desktop\\BankTransaction\\test\\file\\transactions.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Desktop\\BankTransaction\\test\\file\\transactions.txt"));
        writer.write(transactions + " ");
        writer.close();


    }

    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", date=" + date +
                '}';
    }

    public static String readTransaction(String fileLocation) throws IOException {
        Path path = Path.of(fileLocation);
        StringBuilder transaction = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                transaction.append(line);
            }
            return transaction.toString();
        }
    }

    public static String serialize(BankTransaction transaction) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            String json = mapper.writeValueAsString(transaction);
            System.out.println("json:: " + json);

            return json;
        } catch (JsonProcessingException exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String serializeTransactions(List<BankTransaction> transactions){
        try {
            ObjectMapper mapper = new ObjectMapper();

            return mapper.writeValueAsString(transactions);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }

    public static BankTransaction deserialize(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, BankTransaction.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
