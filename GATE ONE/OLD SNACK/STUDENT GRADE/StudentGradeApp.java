import java.util.Scanner;
public class StudentGradeApp {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int pass = 0;
	int fail = 0;
	
	System.out.println("HOW MANY STUDENTS DO YOU HAVE?");
	int studentSize = input.nextInt();
	System.out.println("HOW MANY SUBJECT DO THEY OFFER?");
	int subjectSize = input.nextInt();
	int[][] scores = new int [studentSize][subjectSize];
	System.out.println ("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println ("Saved successfully");
	System.out.println();
	
	for (int count = 0; count < studentSize; count++) {

		for (int count2 = 0; count2 < subjectSize; count2++) {
			System.out.println("ENTERING SCORE FOR STUDENT" + (count + 1));	
			System.out.println("ENTER SCORE FOR SUBJECT" + (count2 + 1));
			scores[count][count2] = input.nextInt();
			System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved Successfully");	
			System.out.println();
 
	if(scores[count][count2] <= 50){
		fail += 1;
	}
	if(scores[count][count2] > 50){
		pass += 1;
	}

	}
	}
		
		System.out.println();

		System.out.println("SCORE TABLE:");
		System.out.print("Subject   ");

	for(int count =1; count <= subjectSize; count++){
	System.out.print("sub"+count+"  ");
	
	}
	
 	System.out.println("total   avg   pos");
	
       for (int row = 0; row < studentSize; row++) {
        	int totalscore = 0;
			float
 average = 0;
			int position = 0;
			int largest = totalscore;
			System.out.print("Student " + (row + 1) + ": ");
            for (int col = 0; col < subjectSize; col++) {
                totalscore += scores[row][col];
				average = totalscore / subjectSize;
				System.out.print(scores[row][col] + "    ");
           	}
		System.out.print(totalscore + "    ");
		System.out.print(average + "    ");
        System.out.println();
	  }

	


	System.out.println();
	System.out.println("NUMBER OF PASSES" + " " + pass);
	System.out.println("NUMBER OF FAILS" + " " + fail);

}
}