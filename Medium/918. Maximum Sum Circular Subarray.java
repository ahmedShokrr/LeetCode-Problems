public class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        int total = 0; // Sum of all elements in the array
        int maxSum = nums[0], curMax = 0; // Variables for tracking max subarray sum
        int minSum = nums[0], curMin = 0; // Variables for tracking min subarray sum

        for (int i = 0; i < nums.length; i++) {
            // Maximum subarray sum in the non-circular array
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curMax);

            // Minimum subarray sum in the non-circular array
            curMin = Math.min(curMin + nums[i], nums[i]);
            minSum = Math.min(minSum, curMin);

            // Total sum of the array
            total += nums[i];
        }

        // If all elements are negative, return maxSum
        if (maxSum > 0) {
            return Math.max(maxSum, total - minSum);
        } else {
            return maxSum;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] nums = {5,-3,5};
        System.out.println(solution.maxSubarraySumCircular(nums));

    }

}
