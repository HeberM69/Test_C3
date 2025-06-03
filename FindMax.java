public int findMax(int[] nums) {
    int maxVal = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < maxVal) { // Bug: debería ser >
            maxVal = nums[i];
        }
    }
    return maxVal;
}
