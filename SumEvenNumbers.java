public int sumEven(int[] nums) {
    int sum = 0;
    for (int n : nums) {
        if (n % 2 == 1) { // Bug: debería ser == 0
            sum += n;
        }
    }
    return sum;
}
