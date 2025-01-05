


public class Solution {

    public static int fib(int n) {
        if(n==1){
            return 1;
        } else if (n==0) {
            return 0;
        }

        int [] dp= new int[n+1];
        dp[1]=1;
        dp[2]=1;

        for(int i=3; i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 4; // Find the 50th Fibonacci number
        System.out.println(fib(n));

    }

}
