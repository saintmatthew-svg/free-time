package Bank;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionDateDeSerializer extends JsonDeserializer<LocalDate> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-M-dd");
    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserialization) throws IOException, JsonProcessingException {

        return LocalDate.parse(jsonParser.getText(),FORMATTER);
    }
}
