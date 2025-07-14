public class TaskNine{
	public static void main(String... args){
	
		int SumFour = 0;
		int multipleFour = 4;
		for(int number = 0; number < 5; number++){
			SumFour += multipleFour;
			multipleFour *= 4;
		}

		int SumEight = 0;
		int multipleEight = 8;
		for(int number = 0; number < 5; number++){
			SumEight += multipleEight;
			multipleEight *= 8;
		}
		int result = SumFour + SumEight;
		System.out.print(result * result);
	}


}

