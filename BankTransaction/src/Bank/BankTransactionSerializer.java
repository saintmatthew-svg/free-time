package Bank;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BankTransactionSerializer {
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
}
