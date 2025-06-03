public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) isPrime[i] = true;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;
            }
        }
        int count = 0;
        for (boolean b : isPrime)
            if (b) count++;
        return count - 1; // Bug: unnecessary subtraction
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Primes less than " + n + ": " + countPrimes(n));
    }
}
