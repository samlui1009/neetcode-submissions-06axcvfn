class Solution {
    public void reverseString(char[] s) {
        int leftPtr = 0;
        int rightPtr = s.length - 1;
        // Set up your pointers first to solve the problem 
        while (leftPtr < rightPtr) {
            char tempChar = s[leftPtr];
            s[leftPtr] = s[rightPtr];
            s[rightPtr] = tempChar;
            leftPtr++;
            rightPtr--;
        }
    }
}