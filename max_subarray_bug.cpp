#include <iostream>
#include <vector>
using namespace std;

int maxSubArray(vector<int>& nums) {
    int maxSum = 0; // Bug: Should be nums[0]
    int currentSum = 0;
    for (int n : nums) {
        currentSum = max(n, currentSum + n);
        maxSum = max(maxSum, currentSum);
    }
    return maxSum;
}

int main() {
    vector<int> nums = {-2,1,-3,4,-1,2,1,-5,4};
    cout << "Max subarray sum: " << maxSubArray(nums) << endl;
    return 0;
}
