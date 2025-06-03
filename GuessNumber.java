public class GuessNumber {
    static int picked = 6;

    public static int guess(int num) {
        return Integer.compare(num, picked);
    }

    public static int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int g = guess(mid);
            if (g == 0) return mid;
            else if (g > 0) left = mid + 1;
            else right = mid - 1;
        }
        return left + 1; // Bug: wrong return when g == 0 is never hit
    }

    public static void main(String[] args) {
        System.out.println("Picked number: " + guessNumber(10));
    }
}
