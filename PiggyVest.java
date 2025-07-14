import java.util.*;
public class PiggyVest {

	public static void main(String... sad){
	Scanner snack = new Scanner(System.in);
	int[] score = new int[10];
	
	for (int count = 0; count < 10; count++) {
		System.out.print("Enter score " + (count + 1) + ": ");
		score[count] = snack.nextInt();
		
	}System.out.print(Arrays.toString(score));
	
	
	}

}