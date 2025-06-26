import java.util.HashMap;

class Solution {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> table = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (table.containsKey(c)){
                table.put(c,table.get(c)+1);
            }else{
                table.put(c,1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!table.containsKey(c) || table.get(c) <= 0) {
                return false;
            }
            table.put(c, table.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: false
    }
}
