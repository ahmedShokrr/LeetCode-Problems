class Solution {

    public static boolean isPalindrome(String s) {
//        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder cleaned = new StringBuilder();
        for (char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }

        int left=0;
        int right= cleaned.length()-1;

        while (left<right){
            if (cleaned.charAt(left)!=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s =" ";
        System.out.println(isPalindrome(s));
    }
}
