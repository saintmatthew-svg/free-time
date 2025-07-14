import java.util.Arrays;

public class MorningTonic {

    public static int[] swapNumber(int firstNumber, int secondNumber) {
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        return new int[] {firstNumber, secondNumber};
    }

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        System.out.print(Arrays.toString(swapNumber(firstNumber,secondNumber)));
    }
}
