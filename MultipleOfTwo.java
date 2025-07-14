import java.util.Scanner;
public class MultipleOfTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		System.out.println();
		Multiple(number1);
		Multiple(number2);
	}

public static void Multiple(int number){
	for(int count = 1; count <= 10; count++){
		int multi;
		multi = number * count;	
		System.out.println(number + "x" + count + "=" + multi);
	} System.out.println();
}

}