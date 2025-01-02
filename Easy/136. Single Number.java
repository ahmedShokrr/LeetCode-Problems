public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2,2,1};
        System.out.println(solution.singleNumber(nums1));

        int[] nums2 = {4,1,2,1,2};
        System.out.println(solution.singleNumber(nums2));

        int[] nums3 = {1};
        System.out.println(solution.singleNumber(nums3));
    }

    public int singleNumber(int[] nums) {
        int result = 0; // Initialize result to 0

        // XOR all numbers in the array
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }


        return result; // The single number remains
    }

}
