public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                return i;
        }
        return -1; // Bug: doesn't check edges
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Peak index: " + findPeakElement(nums));
    }
}
