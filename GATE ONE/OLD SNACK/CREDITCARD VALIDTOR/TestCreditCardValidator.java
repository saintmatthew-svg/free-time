import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestCreditCardValidator {

    @Test
    public void testRightCreditCardNumber() {
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        CreditCardValidator.setCreditCardNumber(creditCardNumber);
        int[] expected = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        assertEquals(Arrays.toString(expected) ,Arrays.toString(CreditCardValidator.getCreditCardNumber()));
    }

    @Test
    public void testSumOfOddIndexNumbersRightToLeft(){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        int expected = 37;
        Assertions.assertEquals(expected, CreditCardValidator.sumOfOddIndexNumbersRightToLeft(creditCardNumber));
    }

    @Test
    public void testSumOfEvenIndexNumbersRightToLeft(){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        int expected = 38;
        assertEquals(expected, CreditCardValidator.sumOfEvenIndexNumbersRightToLeft(creditCardNumber));
    }

    @Test
    public void testSumBothResult(){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        int expected = 75;
        assertEquals(expected, CreditCardValidator.sumOfBothResult(creditCardNumber));
    }

    @Test
    public void testValidity(){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expected = "invalid";
        assertEquals(expected, CreditCardValidator.checkValidity(creditCardNumber));
    }
    @Test
    public void testSize(){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        int expected = 16;
        assertEquals(expected, CreditCardValidator.sizeOfCreditCardNumber(creditCardNumber));
    }

    @Test
    public void testCardTypeVisaCard(){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expected = "VISA CARD";
        assertEquals(expected, CreditCardValidator.cardType(creditCardNumber));
    }

    @Test
    public void testCardTypeMasterCard(){
        int[] creditCardNumber = {5,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expected = "MASTER CARD";
        assertEquals(expected, CreditCardValidator.cardType(creditCardNumber));
    }

    @Test
    public void testCardTypeAmericanExpressCard(){
        int[] creditCardNumber = {3,7,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expected = "AMERICAN EXPRESS CARD";
        assertEquals(expected, CreditCardValidator.cardType(creditCardNumber));
    }

    @Test
    public void testCardTypeDiscoverCard(){
        int[] creditCardNumber = {6,7,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expected = "DISCOVER CARD";
        assertEquals(expected, CreditCardValidator.cardType(creditCardNumber));
    }

    @Test
    public void testGetCardNumber(){
        int[] creditCardNumber = {6,7,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expected = "6788576018402626";
        assertEquals(expected, CreditCardValidator.getCardNumber(creditCardNumber));
    }

}