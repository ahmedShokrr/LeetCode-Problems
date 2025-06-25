// ==============================================
// Approach 1: Using Extra Space (Left and Right Arrays)
// Time Complexity: O(n)
// Space Complexity: O(n)
// ==============================================

import java.util.Arrays;

class SolutionWithExtraSpace {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];

        // left[i] contains the product of all elements to the left of i
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // right[i] contains the product of all elements to the right of i
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // answer[i] = left[i] * right[i]
        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Using Extra Space: " + Arrays.toString(productExceptSelf(nums)));
    }
}


// ==============================================
// Approach 2: Optimized Space
// Time Complexity: O(n)
// Space Complexity: O(1) (excluding the output array)
// ==============================================

class SolutionOptimizedSpace {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // First pass: compute left products in the answer array
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Second pass: multiply with right products using a single variable
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Optimized Space: " + Arrays.toString(productExceptSelf(nums)));
    }
}
