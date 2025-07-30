package Bank;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.time.LocalDate;

public class TransactionDateSerializer extends JsonSerializer <LocalDate> {

    @Override
    public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializers) throws java.io.IOException {
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
       String date = year + "-" + month + "-" + day;
        jsonGenerator.writeString(date);
    }
}
