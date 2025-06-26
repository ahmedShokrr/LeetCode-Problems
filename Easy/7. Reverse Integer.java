class Solution {

    public static int reverse(int x) {
        int reversed=0;

        while (x!=0){
            int digit=x%10;
            if (reversed>Integer.MAX_VALUE/ 10 || reversed<Integer.MIN_VALUE/10){
                return 0;
            }
            x=x/10;
            reversed=reversed*10+digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int x=1254;
        System.out.println(reverse(x));
    }
}
