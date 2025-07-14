import java.util.Scanner;
public class InvestmentPlan {
	public 	static void main(String... args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("	ENTER INVESTMENT AMOUNT: $");
		double initialInvestment = Scanner.nextDouble();
		
		System.out.print("	EN4fTER MONTLY CONTRIBUTION: $");
		double monthlyContribution = Scanner.nextDouble();
		
		System.out.print("	ENTER LENGTH OF TIME (IN YEARS): ");
		int lengthOfYears = Scanner.nextInt();
		
		System.out.print("	'SELECT A NUMBER TO CHOOSE PREFERD COMPOUND FREQUENCY' ");
		int[] amountPerFrequency = {365, 12, 1};
		System.out.println("""
		
		0 = daily.
		1 = montly.
		2 = yearly.
		""");
			int compoundFrequencyIndex = Scanner.nextInt();
	
			int amountPerFrequencychoosen = amountPerFrequency[compoundFrequencyIndex];
			
			System.out.print("	ENTER PREFERED INTEREST RATE: ");
			double interestRate = Scanner.nextDouble();
			
			double totalAmount = initialInvestment;
			 for (int year = 0; year < lengthOfYears; year++) {
            totalAmount += totalAmount * interestRate / amountPerFrequencychoosen;
            
            totalAmount += monthlyContribution * 12;
        }

		System.out.print("	TOTAL RETURN FOR " + interestRate + "% IS = $" + totalAmount);
	}
}