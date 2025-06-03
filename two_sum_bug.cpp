#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> map;
    for (int i = 0; i < nums.size(); ++i) {
        int complement = target - nums[i];
        if (map.count(complement)) {
            return {map[complement], i};
        }
        map[nums[i]] = i;
    }
    return {}; // Bug: fails for duplicates like [3,3], target 6
}

int main() {
    vector<int> nums = {3, 3};
    int target = 6;
    auto res = twoSum(nums, target);
    cout << "Indices: " << res[0] << ", " << res[1] << endl;
    return 0;
}
