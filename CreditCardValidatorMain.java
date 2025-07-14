public class CreditCardValidatorMain {
    public static int sumOfOddIndexNumbersRightToLeft(int[] creditCardNumber) {
        int sum = 0;
        for (int count = creditCardNumber.length - 2; count >= 0; count-=2) {
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

    public static void main(String[] args){
        int[] creditCardNumber = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        System.out.print(sumOfOddIndexNumbersRightToLeft(creditCardNumber));
    }
}
