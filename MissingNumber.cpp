int missingNumber(vector<int>& nums) {
    int result = nums.size();
    for (int i = 0; i < nums.size(); i++) {
        result ^= i ^ nums[i];
    }
    return result ^ 0; // Bug: no es necesario el XOR con 0
}
