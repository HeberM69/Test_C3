public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n % 2; // Bug: should use (n & 1)
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11; // 1011
        System.out.println("1 bits: " + hammingWeight(n));
    }
}
