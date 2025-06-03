public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        while (n > 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 3; // Bug: should be n == 1
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println("Is power of 3: " + isPowerOfThree(n));
    }
}
