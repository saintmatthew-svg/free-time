import java.util.*;
   public class FiveDigits {
    public static void main(String... args){
	Scanner receive = new Scanner(System.in);
	    System.out.print("Enter a five-digit number : ");
	       int number = receive.nextInt();
	   String numberStr = Integer.toString(number);
	   String[]letters = numberStr.split("");
	 for(String letter : letters){
	     System.out.print(letter + " ");
		}
	



}	

}