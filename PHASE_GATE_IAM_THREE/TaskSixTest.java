import org.junit.Test;
import static org.junit.Assert.*;

public class TaskSixTest {

    @Test
    public void testPrintEvenIndexScores() {
        int[] testScores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] expectedEvenIndexScores = {10, 30, 50, 70, 90}; 
        
        int[] actualEvenIndexScores = new int[5];
        int index = 0;
        for (int count = 0; count < testScores.length; count += 2) {
            actualEvenIndexScores[index++] = testScores[count];
        }

        assertArrayEquals(expectedEvenIndexScores, actualEvenIndexScores);
    }
}
