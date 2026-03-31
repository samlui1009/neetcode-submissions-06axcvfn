class Solution {
    public boolean hasDuplicate(int[] nums) {
    // Solution 2 - We could use a HashSet to solve this problem 
    // Justification for using HashSet:
    // A HashSet will only store UNIQUE elements, or elements that only appear ONCE 
    HashSet <Integer> tempSet = new HashSet<>();
    for (int num : nums) {
        if (tempSet.contains(num)) {
            return true;
            // First, do a conditional check to see if the number we see in the nums array 
            // Has been found before in the tempSet
            // If it does, then we can return true immediately
        }
        tempSet.add(num);
        // Otherwise, we add the number
    }
    return false;
    // Otherwise, we return false
    }
}
// Time Complexity: O(n), because you still need to loop through all of the elements within the array 
// Space complexity: O(n), because we use a HashSet that contains the 'n' number of elements within the array

// Solution 1 - This is in O(n^2) time complexity, because there is a nested loop because we need to 
// Loop through the nums array twice consecutively
//         for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;