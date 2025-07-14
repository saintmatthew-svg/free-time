import java.util.Scanner;

public class ClassTask{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter number: ");
		int number = input.nextInt();
		rubber(number);
	}
		
	public static void rubber(int number){	
		String numberstr = Integer.toString(number);
		String[] letters = numberstr.split("");
		for(String word : letters){
			System.out.print(word + " ");
		}
	}
}