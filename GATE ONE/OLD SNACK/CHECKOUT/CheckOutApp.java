
import java.util.Scanner;
	public class CheckOutApp {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("WHAT IS THE CUSTOMER'S NAME:");
			String customersname = input.nextLine();
				
			System.out.println("WHAT DID THE CUSTOMER BUY:");
			String itembought = input.nextLine();	
				
			System.out.println("HOW MANY PIECES:");
			int pieces = input.nextInt();
			
			input.nextLine();
			
			System.out.println("HOW MUCH PER UNIT:");
			int priceperunit = input.nextInt();
			
			input.nextLine();
			
			System.out.println("ADD MORE ITEMS:");
			String addeditem = input.nextLine();
				
			int totalamount = priceperunit * pieces;	
			
				do {
						System.out.println("WHAT DID THE CUSTOMER BUY:");
						String itemboughtagain = input.nextLine();	
				
						System.out.println("HOW MANY PIECES:");
						int piecesagain = input.nextInt();
			
						input.nextLine();
			
						System.out.println("HOW MUCH PER UNIT:");
						int priceperunitagain = input.nextInt();
			
						input.nextLine();
			
						int sum = priceperunitagain * piecesagain; 
						int amounttotal = totalamount + sum; 
					
						System.out.println("ADD MORE ITEMS:");
						addeditem = input.nextLine();
			
					
							
			if (addeditem.equalsIgnoreCase("no")) {
					} System.out.println("WHAT IS YOUR NAME: ");
						String seller = input.nextLine();
						
						System.out.println("HOW MUCH DISCOUNT WILL HE GET:");
						int discount = input.nextInt();
						double vat = 927.50;
						double billtotal = amounttotal + discount + vat;
		
		
		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("Date : 18 - Dec - 22  8:48:11 pm");
		System.out.println("cashier: " + seller);
		System.out.println("Customer Name: " + customersname);
		System.out.println("=====================================================================");
		System.out.println("       ITEM          QTY        PRICE             TOTAL(NGN)");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("      %-15s %-10d %-15d %-20d%n", itembought, pieces, priceperunit, totalamount);
		System.out.printf("      %-15s %-10d %-15d %-20d%n", itemboughtagain, piecesagain, priceperunitagain, sum);
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.print("                                Sub Total:");  System.out.printf("      %-15d%n", amounttotal);
		System.out.print("                                 Discount:");  System.out.printf("      %-15d%n", discount);                   
		System.out.print("                             VAT @ 17.50%:");  System.out.printf("      %-15f%n", vat);                         
		System.out.println("=======================================================================");
		System.out.print("                               Bill Total:");  System.out.printf("      %-15f%n", billtotal);
		System.out.println("=======================================================================");
		System.out.println("		  THIS IS NOT A RECIEPT KINDLY PAY " + billtotal);
		System.out.println("=======================================================================");
		System.out.println();
		
						System.out.println("HOW MUCH DID THE CUSTOMER PAY");
						double paid = input.nextInt();
					
						double balance = paid - billtotal;
					
						System.out.println();	
								
		System.out.println("SEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("Date : 18 - Dec - 22  8:48:11 pm");
		System.out.println("cashier: " + seller);
		System.out.println("Customer Name: " + customersname);
		System.out.println("=====================================================================");
		System.out.println("       ITEM          QTY        PRICE             TOTAL(NGN)");
		System.out.println("---------------------------------------------------------------------");
		System.out.printf("      %-15s %-10d %-15d %-20d%n", itembought, pieces, priceperunit, totalamount);
		System.out.printf("      %-15s %-10d %-15d %-20d%n", itemboughtagain, piecesagain, priceperunitagain, sum);
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.print("                                Sub Total:");  System.out.printf("      %-15d%n", amounttotal);
		System.out.print("                                 Discount:");  System.out.printf("      %-15d%n", discount);                   
		System.out.print("                             VAT @ 17.50%:");  System.out.printf("      %-15f%n", vat);                         
		System.out.println("=======================================================================");
		System.out.print("                               Bill Total:");  System.out.printf("      %-15f%n", billtotal);
		System.out.print("                              Amount Paid:");  System.out.printf("      %-15f%n", paid);
		System.out.print("                                  Balance:");  System.out.printf("      %-15f%n", balance);
		System.out.println();
		System.out.println("=======================================================================");
		System.out.println("		  THANKS FOR YOUR PATRONAGE");
		System.out.println("=======================================================================");
		System.out.println();
		
							} while (addeditem.equalsIgnoreCase("yes"));
				
		}
		
	}	
