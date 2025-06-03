public class CheckPerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i < num / 2; i++) { // Bug: should be i <= num / 2
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println("Is perfect: " + checkPerfectNumber(num));
    }
}
