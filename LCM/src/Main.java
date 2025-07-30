import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,6,12};
        int lcm = Lowest_Common_Multiple.findLCM(numbers);
        System.out.println("LCM of " + Arrays.toString(numbers) + " is: " + lcm);
    }
}