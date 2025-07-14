import java.util.Scanner;

public class CreditCardValidator {
    private static int[] creditCardNumber;
    
    public static int[] getCreditCardNumber() {
        return creditCardNumber;
    }

    public static int sumOfOddIndexNumbersRightToLeft(int[] creditCardNumber) {
        int sum = 0;
        for (int count = creditCardNumber.length - 2; count >= 0; count -= 2) {
            int doubled = creditCardNumber[count] * 2;
            if (doubled > 9) {
                int single = (doubled / 10) + (doubled % 10);
                sum += single;
            } else {
                sum += doubled;
            }
        }
        return sum;
    }

    public static int sumOfEvenIndexNumbersRightToLeft(int[] creditCardNumber) {
        int sum = 0;
        for (int count = creditCardNumber.length - 1; count >= 0; count -= 2) {
            sum += creditCardNumber[count];
        }
        return sum;
    }

    public static int sumOfBothResult(int[] creditCardNumber) {
        return sumOfEvenIndexNumbersRightToLeft(creditCardNumber) + sumOfOddIndexNumbersRightToLeft(creditCardNumber);
    }

    public static String checkValidity(int[] creditCardNumber) {
        if (creditCardNumber == null || creditCardNumber.length == 0) {
            return "invalid number";
        } else if (sumOfBothResult(creditCardNumber) % 10 == 0) {
            return "valid";
        } else {
            return "invalid";
        }
    }

    public static String cardType(int[] creditCardNumber) {
        if (creditCardNumber[0] == 4) {
            return "VISA CARD";
        }
        if (creditCardNumber[0] == 5) {
            return "MASTER CARD";
        }
        if (creditCardNumber[0] == 3 && creditCardNumber[1] == 7) {
            return "AMERICAN EXPRESS CARD";
        }
        if (creditCardNumber[0] == 6) {
            return "DISCOVER CARD";
        }
        return "INVALID CARD";
    }
    public static int sizeOfCreditCardNumber(int[] creditCardNumber) {
        return creditCardNumber.length;
    }

    public static String getCardNumber(int[] creditCardNumber) {
        StringBuilder accountNumber = new StringBuilder();
        for (int j : creditCardNumber) {
            accountNumber.append(j);
        }
        return accountNumber.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] creditCardNumber = new int[16];
        System.out.println("Enter credit card number: ");
        String number = input.nextLine();
        for (int count = 0; count < number.length(); count++) {
            creditCardNumber[count] = Integer.parseInt(number.charAt(count) + "");
        }
        System.out.println("credit card number: " + creditCardNumber);
        System.out.println("credit card type: " + cardType(creditCardNumber));
        System.out.println("credit card length: " + sizeOfCreditCardNumber(creditCardNumber));
        System.out.println("credit card validity status: " + checkValidity(creditCardNumber));
    }
}



