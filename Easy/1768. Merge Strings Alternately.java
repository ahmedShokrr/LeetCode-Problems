class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int word1len=word1.length();
        int word2len=word2.length();

        for (int i = 0; i < Math.max(word1len,word2len) ; i++) {
            if (i < word1len) {
                sb.append(word1.charAt(i));
            }
            if (i < word2len) {
                sb.append(word2.charAt(i));
            }
        }
        
        return sb.toString();
    }
      public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        String result = Solution.mergeAlternately(word1, word2);
        System.out.println("Merged String: " + result);  // Expected: "apbqcr"
    }
}
