class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        // This sets up the positions of the 2 "pointers" that we will need to use 
        // In order to reverse the characters in place 
        // So, for example, if we had the string "apple", then left starts at "a"
        // And right starts at "e"
        // We can use a while loop for 2 pointer-related problems
        while (left < right) {
            char temp = s[left];
            // Set up a character, "temp", to ensure we retained it in memory 
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}