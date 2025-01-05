public class Solution {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max_prod = nums[0]; // Maximum product found so far
        int curr_max = nums[0]; // Current maximum product including nums[i]
        int curr_min = nums[0]; // Current minimum product including nums[i]

        for (int i = 1; i < nums.length; i++) {
            int temp = curr_max; // Store current max temporarily

            // Update curr_max and curr_min
            curr_max = Math.max(nums[i], Math.max(curr_max * nums[i], curr_min * nums[i]));
            curr_min = Math.min(nums[i], Math.min(temp * nums[i], curr_min * nums[i]));

            // Update the overall maximum product
            max_prod = Math.max(max_prod, curr_max);
        }

        return max_prod;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int [] nums = {-2,0,-1};
        System.out.println(solution.maxProduct(nums));

    }

}
