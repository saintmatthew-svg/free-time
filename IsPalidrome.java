public class IsPalidrome {
	public static void main(String[] args){
		int num = 242;
		int reversed = 0;
		int value = num;
		for(;value > 0;){
			int store = value % 10;
			reversed = (reversed * 10) + store;
			
			value /= 10;
		}
		 
		 if(reversed == num){
			 System.out.print("number is a palidrome");
		 } else {
			 System.out.print("number is not palidrome");
		 }
	}
}