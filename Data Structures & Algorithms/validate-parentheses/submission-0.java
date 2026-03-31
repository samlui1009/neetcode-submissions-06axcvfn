class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> dictMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        dictMap.put(')', '(');
        dictMap.put(']', '[');
        dictMap.put('}', '{');
        // We set up two variables, a HashMap and a Stack 
        // The HashMap's key will be the closing bracket, and the 
        // opening bracket will be the value

        for (int i = 0 ; i < s.length(); i++) {
            // Loop through every character in the String, s
            if (dictMap.containsKey(s.charAt(i))) {
                // If the character we encounter is found in the dictionary
                if (!stack.isEmpty() && stack.peek() == dictMap.get(s.charAt(i))) {
                    stack.pop();
                    // We need to check if the stack is NOT empty
                    // And if the top of the stack is equal to the corresponding value
                    // Then, we pop it, that's one "correct" combination of brackets
                } else {
                    return false;
                    // Otherwise, we return false
                }
            } else {
                stack.push(s.charAt(i));
                // And OTHERWISE, that means we have a opening bracket, 
                // And we need to push it into the stack 
            }
        }
        return stack.isEmpty();
        // Then, we just return back whether the stack is empty (Or not)
    }
}
