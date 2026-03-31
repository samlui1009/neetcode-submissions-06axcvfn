class Solution {
        public boolean isAlphaNum(char c) {
            return (c >= 'A' && c <= 'Z' ||
                    c >= 'a' && c <= 'z' ||
                    c >= '0' && c <= '9');
        }
        // Helper function, will be called later

    public boolean isPalindrome(String s) {
        // A Palindrome, as defined, is a String where when read from left to 
        // right, and read backwards from right to left, they should be the same String 
        // Given that we must also make sure our function is case-INsensitive 
        // And it must ignore non-alphanumeric characters 
        // It'd probably be better to have a helper function to 
        // Double check that the characters we encounter in the String are alpha-numeric 

        // For this type of question, it is probably best to use a Two-Pointer approach 
        // So we can approach the String from two separate ends - left-side AND right-side 

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isAlphaNum(s.charAt(left))) {
                left++;
            }
            while (right > left && !isAlphaNum(s.charAt(right))) {
                right--;
            }
            // These nested while loops are necessary to double check that
            // the alpha-numerical stipulation 
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }  
            left++;
            right--;
        }

        return true;        
    }
}
