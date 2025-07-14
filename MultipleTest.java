import java.util.Arrays;y
import java.util.ArrayList;
  public class MultipleTest {
		  
	  @Test
	public int multiply (int firstNumber, int secondNumber) {
		int multiply = firstNumber * secondNumber;
		return multiply;
		}
		@Test
	public int multiple (int firstNumber, int secondNumber) {
		int count = 0;
          for(int counter = 1; counter <= secondNumber; counter++){   
          count += firstNumber;
       } return count;
		@Test
	public int addOperator(int[] num){
		int total = 0;
		for(int i = 0; i < num.length; i++){
		total += num[i];  
		} return total;
	}

}