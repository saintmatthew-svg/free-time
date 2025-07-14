import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
	public static int division(int numerator, int denominator) throws ArithmeticException{
		return numerator / denominator;
	}
	public static int remainder(int numerator, int denominator) throws ArithmeticException{
		return numerator % denominator;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		
		do{
			try{
				System.out.print("ENTER NUMERATOR: ");
				int numerator = input.nextInt();
				while(numerator == 0){
					System.out.print("invalid numerator enter a valid number\n");
					System.out.print("ENTER NUMERATOR: ");
					numerator = input.nextInt();
				}
				
				System.out.print("ENTER DENOMINATOR: ");
				int denominator = input.nextInt();
				
				int result = division(numerator, denominator);
				System.out.printf("%n RESULT: %d / %d = %d" , numerator, denominator, result);
				int resultremainder = remainder(numerator, denominator);
				System.out.printf("%n RESULT: %d %% %d = %d%n" , numerator, denominator, resultremainder);
				continueLoop = false;
			}
		
			catch(InputMismatchException inputMismatchException){
				System.out.printf("YOU MUST ENTER A VALID INTEGER. PLEASE TRY AGAIN.%n%n");
				input.nextLine();
			}
			catch(ArithmeticException arithmeticException){
				System.out.printf("ZERO IS AN INVALID DENOMINATOR. TRY AGAIN.%n%n");
			}
		} while (continueLoop); 
	}
}