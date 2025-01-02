import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> result = solution.minimumAbsDifference(arr);
        System.out.println(result);
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize variables
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Step 3: Sliding window to find minimum difference
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i+1] - arr[i]);

            if (diff < minDiff) {
                // Found a smaller difference, clear list and update minDiff
                minDiff = diff;
                list.clear();
                list.add(Arrays.asList(arr[i], arr[i+1]));
            } else if (diff == minDiff) {
                // Add pair with the same minimum difference
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return list;
    }
}
