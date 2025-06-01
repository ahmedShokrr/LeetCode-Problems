import java.util.ArrayList;
import java.util.List;

class Solution {

    // This method takes a sorted array of unique integers and returns a list of string ranges
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        // Loop until we process all numbers in the array
        while (i < n) {
            int start = nums[i]; // Start of the current range

            // Move forward as long as the next number is consecutive (nums[i + 1] == nums[i] + 1)
            while (i < n - 1 && nums[i] + 1 == nums[i + 1]) {
                i++; // Extend the current range
            }

            // If we found a range (start != nums[i]), format it as "start->end"
            if (start != nums[i]) {
                ans.add(start + "->" + nums[i]);
            } else {
                // If there's no range (just a single number), add it as-is
                ans.add(String.valueOf(nums[i]));
            }

            i++; // Move to the next unprocessed number
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }
}
