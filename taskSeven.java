public class taskSeven{

	public static void main(String... sad){
		int result = 0;
	int sumOFFour = 0;
	int multipleFour = 4;
	
		for (int count = 0; count < 5; count++){
		
			
			sumOFFour += multipleFour;
			multipleFour *= 4;
			
		}
		
			int sumOFEight = 0;
			int multipleEight = 8;
			
				for (int count = 0; count < 5; count++){
				
				sumOFEight += multipleEight;
					multipleEight *= 8;
					
				
			}
			result = sumOFEight + sumOFFour;
			System.out.print(result * result);
	}
}