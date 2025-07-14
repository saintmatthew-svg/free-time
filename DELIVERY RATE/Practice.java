import java.util.Scanner ;
public class Practice {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int basePay = 5000;
		int[] amountPerParcel = {160, 200, 250, 500};
		
		System.out.println("what is todays successful delivery");
		int delivery = input.nextInt();
		
		if (delivery < 50) {
			System.out.print("wage: " + (delivery * amountPerParcel[0] + basePay));
		
		} else if(delivery >= 50 && delivery <= 59) {
			System.out.print("wage: " + (delivery * amountPerParcel[1] + basePay));
		
		} else if(delivery > 59 && delivery <= 69) {
			System.out.print("wage: " + (delivery * amountPerParcel[2] + basePay));
		
		} else if(delivery > 70) {
			System.out.print("wage: " + (delivery * amountPerParcel[3] + basePay));
		}
		
	}
}