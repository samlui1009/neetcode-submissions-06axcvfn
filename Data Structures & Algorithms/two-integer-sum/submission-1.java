class Solution {
    public int[] twoSum(int[] nums, int target) {
    // The problem guarantees that there is one solution
    // The array must have 2 elements 
    // First, we'll start off with an outer loop that starts looping from
    // Index 0, or the first element
    // Finding pairs 
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i,j};
            }    
        }
    }
    return new int[0];
    }
}
