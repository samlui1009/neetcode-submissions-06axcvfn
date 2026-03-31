class Solution {
    public void reverseString(char[] s) {
        // Use the Two-Pointer method, one that
        // starts at position 0 of the String, and the right 
        // That starts at s.length - 1;
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}