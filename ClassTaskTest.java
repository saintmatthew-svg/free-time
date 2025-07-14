import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClassTaskTest {
	 
	@Test
	public static void testThatClassTaskPrintOnlyUniqueNumber() {
		
			int[] input = {5,3,5,3,2,3};
			int expected = 3;
			int result = ClassTask.UniqueNumber(input);
			assertEquals(expected, result);
	}

}