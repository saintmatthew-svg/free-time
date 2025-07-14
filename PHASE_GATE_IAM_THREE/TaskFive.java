import java.util.Scanner;

public class TaskFive {
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
        System.out.println("Scores from even positions");
        for (int count = 1; count < scores.length; count += 2) {
            System.out.println(scores[count]);  
        }
    }
}
