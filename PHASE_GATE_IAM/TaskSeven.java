public class TaskSeven{
	public static void main(String... args){
	
		int SumFour = 0;
		int multipleFour = 4;
		for(int number = 0; number < 5; number++){
			SumFour += multipleFour;
			multipleFour *= 4;
		}
		System.out.print(SumFour + " ");

		int SumEight = 0;
		int multipleEight = 8;
		for(int number = 0; number < 5; number++){
			SumEight += multipleEight;
			multipleEight *= 8;
		}
		System.out.print(SumEight);
		
	}


}

