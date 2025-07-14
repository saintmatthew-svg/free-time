import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskSevenTest {

    @Test
    public void testPrintEvenIndexScores() {
        int[] testScore= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int expectedSum = 300;

        int actualSum = 0;
        for (int count = 1; count < testScore.length; count += 2) {
            actualSum += testScore[count];
        }
        assertEquals(expectedSum, actualSum);
    }
}
