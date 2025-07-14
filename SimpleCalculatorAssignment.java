import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
	
	public class SimpleCalculatorAssignment {

		@Test
		
	public void testThatCalculatorCanMultiplyTwoNumbers() {
			
			MultipleTest myCalculator = new MultipleTest();
			int multiply = myCalculator.multiply(2,2);
			assertEquals(4, multiply);
			
		}
		@Test
	public void testThatCalculatorCanMultiplyTwoNumbers() {
			
			MultipleTest myCalculator = new MultipleTest();
			int multiple = myCalculator.multiple(4,2);
			assertEquals(8, multiple);
		}
		@Test
	public void testThatCalculatorCanMultiplyTwoNumbers() {
			
			   SimpleCalculator  myCalculator = new SimpleCalculator();
                int[] num = {2,2,2,2,2};
                int addOperator = myCalculator.addOperator(num);
                 
                 assertEquals(10, addOperator);
   
	}

	}