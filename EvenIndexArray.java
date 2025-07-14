import java.util.Scanner;
public class EvenIndexArray {
    public static void getEvenNumber(int number){
	String letters = Integer.toString(number);
	String[] words = letters.split("");
	for(String letter : words){
		System.out.print(letter + " ");
	}
    }

    public static void main(String... args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter five numbers: ");
	int number = input.nextInt();
	getEvenNumber(number);
    }

}