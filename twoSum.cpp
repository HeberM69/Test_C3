#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> map;
    for (int i = 0; i < nums.size(); ++i) {
        // Bug: asigna primero el valor antes de verificar
        map[nums[i]] = i;  // ← Esto debería ir después de la verificación
        int complement = target - nums[i];
        if (map.count(complement)) {
            return {map[complement], i};
        }
    }
    return {};
}

int main() {
    vector<int> nums = {3, 3};
    int target = 6;
    auto res = twoSum(nums, target);
    cout << "Indices: " << res[0] << ", " << res[1] << endl;
    return 0;
}
