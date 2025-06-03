public boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i < n / 2; i++) { // Bug: debería ser i <= sqrt(n)
        if (n % i == 0) return false;
    }
    return true;
}
