class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Pseudocode Solution
        // Given a primitive array of integers, we would like to
        // Determine if the array contains any duplicates
        // We will be returning a Boolean value if there are
        // duplicates (True, if the element appears more than twice)
        // And false if not 

        // 1. Pick the optimal data structure
        // HashMap
        // Key-Value pair
        // O(1), but the solution I'm thinking of requires 
        // Creating a temporary hashmap, and then
        // Creating another temporary Collection to loop through
        // All the values to find any that are greater than or equal to 2
        // Memory usage is high

        // HashSet
        // A Set, only contains UNIQUE elements 
        // O(n)
        // Set up the Hashset

        HashSet<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (tempSet.contains(nums[i])) {
                return true;
            } else {
                tempSet.add(nums[i]);
            }
        }
        return false;
    }
}