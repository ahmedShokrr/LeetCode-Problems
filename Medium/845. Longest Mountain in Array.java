import java.util.*;

class Solution {
    public static void main(String[] args) {

        // Test cases
        int[] arr1 = {2, 1, 4, 7, 3, 2, 5};
        System.out.println(longestMountain(arr1)); // Output: 5

        int[] arr2 = {2, 2, 2};
        System.out.println(longestMountain(arr2)); // Output: 0

    }
    public static int longestMountain(int[] arr) {
        if (arr.length<3) // A mountain requires at least 3 elements.
            return 0;

        int maxLen=0;
        int i =1;

        while (i<arr.length-1){
            // Check if `arr[i]` is a peak
            if (arr[i]>arr[i-1] &&arr[i]>arr[i+1]){
                int left=i-1;
                int right=i+1;


                //expand left to find the start of the mountain
                while (left>0&& arr[left]>arr[left-1]){
                    left--;
                }

                //expand right  to find the end of the mountain
                while (right<arr.length-1&&arr[right]>arr[right+1]){
                    right++;
                }

                // calculate the length of the mountain
                int currentLen=right-left+1;
                maxLen=Math.max(currentLen,maxLen);

                //move i to right  avoid redundant checks
                i=right;

            }else{
                i++;
            }
        }
        return maxLen;
    }
}
