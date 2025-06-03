#include <iostream>
#include <vector>
using namespace std;

int removeDuplicates(vector<int>& nums) {
    int i = 1;
    for (int j = 1; j < nums.size(); ++j) {
        if (nums[j] != nums[j-1]) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i + 1; // Bug: should be just 'i'
}

int main() {
    vector<int> nums = {1, 1, 2};
    int len = removeDuplicates(nums);
    cout << "Length: " << len << endl;
    return 0;
}
