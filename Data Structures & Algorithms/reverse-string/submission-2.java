class Solution {
    public void reverseString(char[] s) {
        // We could use a Stack data structure 
        // We can push every single character in the character array into the stack
        Stack<Character> tempStack = new Stack<>();
        for (char c : s) {
            tempStack.push(c);
            // Push each character that we see in the String into the Stack
        }
        int currIndex = 0;
        // Start off with current index 
        while (!tempStack.isEmpty()) {
            s[currIndex++] = tempStack.pop();
            // It would increment the index AFTER we pop it 
            // So for example, if we had the character "teen" that we wanted to reverse
            // into "neet"
        }
        // While the stack is NOT empty
    }
}