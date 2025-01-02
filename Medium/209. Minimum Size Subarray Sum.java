public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println(solution.minSubArrayLen(target1, nums1)); // Output: 2

        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println(solution.minSubArrayLen(target2, nums2)); // Output: 1

        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solution.minSubArrayLen(target3, nums3)); // Output: 0
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        // Loop through the array using the 'right' pointer
        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // Shrink the window from the left while the sum is greater than or equal to the target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        // If no valid subarray was found, return 0
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        } else {
            // Return the minimum length of the subarray
            return minLength;
        }
    }

}
