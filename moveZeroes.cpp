#include <iostream>
#include <vector>
using namespace std;

void moveZeroes(vector<int>& nums) {
    int lastNonZero = 0;
    for (int i = 0; i <= nums.size(); ++i) { // Bug: should be i < nums.size()
        if (nums[i] != 0) {
            swap(nums[lastNonZero++], nums[i]);
        }
    }
}

int main() {
    vector<int> nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
    for (int n : nums) cout << n << " ";
    return 0;
}
