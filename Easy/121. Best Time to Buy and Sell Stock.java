class Solution {

    public static int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int maxProfit=0;

        while (right!=prices.length){
            if (prices[left]<prices[right]){
                int profit=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit,profit);
            }else {
                left=right;
            }

            right=right+1;
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));

    }
}
