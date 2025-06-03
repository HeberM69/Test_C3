import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] == 10) digits[i] = 0;
            else return digits;
        }
        return digits; // Bug: does not handle all-9 case correctly
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
