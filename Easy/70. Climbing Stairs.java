

public class Solution {

    public static int climbStairs(int n) {
    if (n==1){
        return 1;
    }
        // dp[i] represents the number of distinct ways to reach the i-th step
        int[] dp= new int[n+1];
        // Base cases:
        // There is 1 way to climb to the first step
        dp[1] = 1;
        // There are 2 ways to climb to the second step:
        // 1 step + 1 step or directly 2 steps
        dp[2] = 2;

        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3; // Find the 50th Fibonacci number
        System.out.println(climbStairs(n));

    }

}
