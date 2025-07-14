import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
	
	@Test
	
	public void testThatCalculatorCanAddTwoNumbers() {
		
			SimpleCalculator myCalculator = new SimpleCalculator();
			assertEquals(1, myCalculator.add(2, 2));
	}

}