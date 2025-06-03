// LeetCode Problem 125: Valid Palindrome

 class Solution {

    public static boolean isPalindrome(String s) {
      
      boolean op = true;
      StringBuilder str = new StringBuilder();

      for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (Character.isLetterOrDigit(ch)) {
            
            str.append(Character.toLowerCase(ch));
        }
      }
     
      for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
        if (str.charAt(i) == str.charAt(j)) {
            op = true;
        } else {
            return false;
        }
      }
      return op;
    }
}


// LeetCode Problem 125: Valid Palindrome (2nd approach)

 class 125 {

    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
        }

        return true;
    }
}