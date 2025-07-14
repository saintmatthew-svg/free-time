public class PracticeText {
	public static void main(String[] args) {

	int [][] number = {
			{1,3,2},
			{5,6,4},
			{8,7,9}
		};

		simple(number);
	}

public static void simple(int[][] number){
	
    for (int count = number.length - 1; count >=0; count--){
        for(int counter = number[count].length -1; counter >= 0; counter--){
	    System.out.println(number[count][counter]);
	}
    }


}

}