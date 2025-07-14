import java.util.Scanner;
public class TaskEight{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		int sum = 0;
		for(int count =1; count <= 10; count++){
			System.out.print("score" + count + " ");
			int score = input.nextInt();
			while(score < 0 || score > 100){
				System.out.println("invalid input must be 0 - 100: ");
				System.out.print("score" + count + " ");
				score = input.nextInt();
			}
			sum += score;
		}	
		System.out.print(sum);
		
	}


}