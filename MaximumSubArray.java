public class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = 0;
        for (int num : nums) {
            current_sum += num;
            if (current_sum > max_sum) max_sum = current_sum;
            else if (current_sum < 0) current_sum = 0; // Bug similar
        }
        return max_sum;
    }
}
