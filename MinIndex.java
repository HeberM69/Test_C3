public int minIndex(int[] nums) {
    int minIdx = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > nums[minIdx]) { // Bug: debería ser <
            minIdx = i;
        }
    }
    return minIdx;
}
