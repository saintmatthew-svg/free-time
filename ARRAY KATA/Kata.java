import java.util.Scanner;
	public class Kata {
		public static void main(String... args){
// (1)
	Scanner userInput = new Scanner(System.in);

int even = 2;

System.out.println("(1) Display TRUE if number is even and Display FALSE if number is odd ");
System.out.println("Enter a number");

int num1 = userInput.nextInt();

boolean evenNum = (num1 % even == 0);
	System.out.println(evenNum);

// (2)

System.out.println("(2) ENTER A NUMBER TO CHECK IF IT IS A PRIME NUMBER : ");
	int primeNumber = userInput.nextInt();
	
	boolean isPrime = true;
	int counter =2;
	if(primeNumber ==0 || primeNumber == 1){
		System.out.println(primeNumber + " is not prime.");
}
	else{
	
	while( counter < primeNumber){
		if(primeNumber % counter ==0){
	System.out.println(primeNumber + " is not prime.");
		isPrime = false;
	
		break;
}
	  counter++;
}
	if (isPrime){
	System.out.println(primeNumber + " is prime.");
	
}

}

// (3)
System.out.println("(3) ENTER TWO NUMBER TO SUBTRACT AND GET POSSITIVE ANSWER ONLY");

int num2 = userInput.nextInt(); 
int num3 = userInput.nextInt();
int diffrence = Math.abs(num2 - num3);

System.out.println(diffrence);

// (4)
System.out.println("(4) FLOAT RETURN ZERO IF SECOND NUMBER IS 0");

int num4 = userInput.nextInt();
int num5 = userInput.nextInt();
int divide = num4/num5;

if (num5 == 0){
 System.out.println("(zero)");

} else {
	System.out.println(divide);
}

// (5);

System.out.println("(5) ENTER A NUMBER TO CHECK HOW MANY FACTOR IT HAS");
int num6 = userInput.nextInt();
int count = 0;

for(int x = 1; x <= num6; x++) {
	if(num6 % x == 0) {
	System.out.println(x);
	count++;
}
}
System.out.println("total number of factors :" + count);

// (6)

System.out.println("(6) ENTER A NUMBER TO RETURN TRUE IF A NUMBER IS A SQUARE NUMBER");

int num7 = userInput.nextInt();
int squareroot = (int)Math.sqrt(num7);

if(squareroot * squareroot == num7){
	System.out.println("true");

} else {
	System.out.println("false");
}

// (7)

System.out.println("(7) ENTER 5 DIGIT NUMBER TO CHECK IF NUMBER IS A PALINDROME");
	int fiveNumber = userInput.nextInt();
	int firstMode = 0;
	int fourNumber = 0;
	int secondMode = 0;
	int twoNumber = 0;
	int forthMode = 0;
	int fifthMode = 0;

	firstMode = fiveNumber % 10;
	fourNumber = fiveNumber / 10;
	secondMode = fourNumber % 10;
	twoNumber = fourNumber / 100;
	forthMode = twoNumber % 10;
	fifthMode = twoNumber / 10;
	
	boolean isPalindrome = firstMode == fifthMode &&  secondMode == forthMode;
	

	if(isPalindrome){
		System.out.println(fiveNumber + " is a palindrome");
}
	else{
		System.out.println(fiveNumber + " is a not palindrome");
}

// (8)

System.out.println("(8) ENTER A NUMBER TO CHECK THE FACTORIAL OF THE NUMBER");
int num8 = userInput.nextInt();
long factorial = 1;

for(int f = 1; f <= num8; f++){
factorial *= f;
}
System.out.println(factorial);

// (9)

System.out.println("(9) ENTER A NUMBER TO CHECK SQUARE OF THE NUMBER");
int number = userInput.nextInt();

long square = number * number;
System.out.println("number is a perfect squareroot");
System.out.println(square);
System.out.println(number + "*" + number);



}

}