class Solution {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true; // an empty string is a subsequence of any string
        }

        int pointer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pointer)) {
                pointer++;
                if (pointer == s.length()) {
                    return true; // All characters of s are found in t in order
                }
            }
        }
        return false; // Not all characters of s were matched
    }


    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println(result); // Output: true

    }
}
