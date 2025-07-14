import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.print(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int counter = 0;
        int result = 0;
        int[] newArr = new int[nums.length + 1];
        for (int count = 0; count < nums.length; count++) {
            newArr[count] = count;
            count++;
        }
        for (int count = 0; count < nums.length; count++) {
            if (newArr[count] != nums[count]) {
                result = newArr[count];
            }
        }return result;
    }

}