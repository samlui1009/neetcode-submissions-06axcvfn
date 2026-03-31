class Solution {
    public int[] getConcatenation(int[] nums) {
        int arrayLength = nums.length;
        int newLength = arrayLength*2;
        int[] res = new int[newLength];
        for (int i = 0; i < nums.length; i++) {
            res[i] = res[i+arrayLength] = nums[i]; 
        }
        return res;
    }
}