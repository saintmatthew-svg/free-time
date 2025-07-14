import java.util.Scanner;

public class dot {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of greeting from 1 to 10: ");
	int number = input.nextInt();
	printHello(number);
}
public static void printHello(int number){
	int count = 0;
	
	if(number > count){
		System.out.print("hello ");
		printHello(number - 1); 
	}	
	//printHello(number - 1); 
}
}


