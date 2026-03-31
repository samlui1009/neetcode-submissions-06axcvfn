class Solution {
    public int[] twoSum(int[] nums, int target) { 
        // There are 2 ways to solve this problem 
        // The first in the Brute Force method 
        for (int i = 0; i < nums.length; i++) {
            // We loop through all elements, starting at 0 and it increases by one at the end of each loop
            for (int j = i + 1; j < nums.length; j++) {
                // At the same time, we loop through the elements one index ahead
                // This allows us to always consistently check the current element, and the element ahead of it
                // This already ensures that i != j, as in the elements we check will not share the same index
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                    // We just want to check IF the element at 'i' and 'j' exclusively will 
                    // Be equal (Checking for equality)
                    // Return a new Integer array, that only contains these two values
                }
                // A conditional statement here, where we 
            }
        }
        return new int[0];
        // Otherwise, this will be what we're returning - An integer array 
        // That has a size of 0
    }
}