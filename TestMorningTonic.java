import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestMorningTonic {
    @Test
    public void testThatNumberSwaps(){
        int f = 3;
        int s = 2;
        assertArrayEquals(new int[]{2, 3},MorningTonic.swapNumber(f,s));
    }
}
