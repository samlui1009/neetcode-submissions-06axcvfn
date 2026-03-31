class Solution {
    public boolean hasDuplicate(int[] nums) {
        // We are given a parameter, nums, that is an array of integers 
        // The return value for this function is a Boolean
        // We return TRUE if any value appears more than once 
        // We return FALSE if every value in the array is a unique integer 
        // Potential edge cases we may have:
        // An array that contains no elements (?)
        // An array with one element - Should return false
        // An array with two elements - Branches off into cases where the two integers 
        // Are the same (Thus, returning true), or false (If both are not duplicates)

        // Data Structure to choose?
        // HashMap
        // Key = Integer that we observe in the array
        // Value = Number of times/occurrences that the integer shows up 
        // HashSet
        // A hashset will only contain UNIQUE value, which means that anything that is a duplicate
        // Will render the correct Boolean result immediately 

        // Step 1: Set up the  Data Structure
        HashSet<Integer> tempSet = new HashSet<>();
        // Instantiate the new hashset

        // Using a for loop, we must loop through the numbers found within the array
        for (int i = 0; i < nums.length; i++) {
            if (!tempSet.contains(nums[i])) {
                tempSet.add(nums[i]);
                // The if conditional - If the set does NOT contain the element
                // Add it into the temporary set 
            } else {
                // Then, the else conditional - If the set DOES contain it
                return true;
            }
        }
        return false;
    }
}