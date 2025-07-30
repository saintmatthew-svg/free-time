public class Lowest_Common_Multiple {
    public static int findLCM(int numberOne, int numberTwo) throws ArithmeticException {
        try {
            int lcm = numberTwo;
            while (lcm % numberOne != 0) {
                lcm += numberTwo;
            }
            return lcm;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    public static int findLCM(int[] numbers) throws ArithmeticException {
        try {
            if (numbers.length == 0) return 0;
            int currentLCM = numbers[0];
            for (int count = 1; count < numbers.length; count++) {
                currentLCM = findLCM(currentLCM, numbers[count]);
            }
            return currentLCM;
        } catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}