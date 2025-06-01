class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder prefix = new StringBuilder();

        // Outer loop goes character by character of the first string
        for (int j = 0; j < strs[0].length(); j++) {
            char currentChar = strs[0].charAt(j);

            // Compare this character with the same index in all other strings
            for (int i = 1; i < strs.length; i++) {
                // If the index is out of bounds or characters don't match
                if (j >= strs[i].length() || strs[i].charAt(j) != currentChar) {
                    return prefix.toString();  // Return prefix built so far
                }
            }

            // If currentChar matches across all strings at this position, append to prefix
            prefix.append(currentChar);
        }

        return prefix.toString();
    }
    public static void main(String[] args) {

        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}
