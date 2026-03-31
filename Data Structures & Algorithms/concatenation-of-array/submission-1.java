class Solution {
    public int[] getConcatenation(int[] nums) {
        // We need to determine what the length of the nums array currently is 
        // Because we need to create a new array of length, 2n, so it's doubled 
        int currLength = nums.length;
        int newLength = currLength*2;
        int[] answer = new int[newLength];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = answer[i+currLength] = nums[i];
            // So basically, what we're doing is:
            // Index 0 will have the number at nums[i]
            // As will 0 + currLength, which is 0 + 4, so position 4 
        }
        return answer;
    }
}