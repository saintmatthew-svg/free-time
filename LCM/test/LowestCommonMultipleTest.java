import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonMultipleTest {

    @Test
    public void testForTwoNumbers () {
        int numberOne = 6;
        int numberTwo = 4;
        assertEquals(12, Lowest_Common_Multiple.findLCM(numberOne,numberTwo));
    }

    @Test
    public void testForArrayOfMultipleNumbers () {
        int[] firstNumbers = {4, 6};
        assertEquals(12, Lowest_Common_Multiple.findLCM(firstNumbers));

        int[] secondNumbers = {12, 18, 24};
        assertEquals(72, Lowest_Common_Multiple.findLCM(secondNumbers));

        int[] thirdNumbers = {6,4,8,12,34};
        assertEquals(408, Lowest_Common_Multiple.findLCM(thirdNumbers));
    }

    @Test
    public void testForArrayOfMultipleZeros () {
        int[] firstNumbers = {0, 0, 0};
        assertThrows(ArithmeticException.class, () -> {
            Lowest_Common_Multiple.findLCM(firstNumbers);
        });
    }

}