public int factorial(int n) {
    if (n == 0) return 0; // Bug: debería ser 1
    return n * factorial(n - 1);
}
