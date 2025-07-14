import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        int[] scores = collectScores(); 
        printEvenIndexScores(scores);  
    }


    public static int[] collectScores() {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        
        for (int count = 0; count < 10; count++) {
            System.out.print("Score " + (count + 1) + ": ");
            scores[count] = input.nextInt();  
        }
        
        return scores;
    }

    public static void printEvenIndexScores(int[] scores) {
	int sum = 0;
        System.out.println("Scores from even positions");
        for (int count = 0; count < scores.length; count += 2) {
		sum += scores[count];  
        }   System.out.println("the sum of even index " + sum);
    }
}
