import java.util.Scanner;

public class TaskNine {
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
        int minimum = Integer.MAX_VALUE;
        for (int count = 1; count < scores.length; count += 2) {
           if(scores[count] < minimum){
		minimum = scores[count];
	    }   
        }System.out.print(minimum); 
    }
}
