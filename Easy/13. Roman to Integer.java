import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        int total=0;

        HashMap<String,Integer> romanMap =new HashMap<>();
        romanMap .put("I",1);
        romanMap .put("V",5);
        romanMap .put("X",10);
        romanMap .put("L",50);
        romanMap .put("C",100);
        romanMap .put("D",500);
        romanMap .put("M",1000);

        int inputLen=s.length();
        for (int i = inputLen - 1; i >= 0; i--) {
            if (i!=0){
                char currentChar = s.charAt(i);
                char previousChar = s.charAt(i - 1);
                int currentValue = romanMap.get(String.valueOf(currentChar));
                int previousValue = romanMap.get(String.valueOf(previousChar));

                if (currentValue <=previousValue){
                    total=total+currentValue;
                }else{
                    total=total+currentValue;
                    total=total-previousValue;
                    i--;  // Skip the previous character since it's been processed
                }
            }
            else {
                char last = s.charAt(i);
                int lastValue = romanMap.get(String.valueOf(last));
                total = total + lastValue;
            }
        }
        return total;
    }



    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }


}
