import java.util.*;

class Solution {

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet=new HashSet<>();
        int counter=0;

        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelSet.contains(stones.charAt(i))){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
    String jewels="aA";
    String stones="aAAbbbb";
    System.out.println((numJewelsInStones(jewels,stones)));
    }
}
