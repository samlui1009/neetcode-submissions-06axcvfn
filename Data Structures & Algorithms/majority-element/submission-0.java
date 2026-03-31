class Solution {
    public int majorityElement(int[] nums) {
        int arrayLength = nums.length;
        int cutOff = (int) arrayLength/2;
        int flooredCutOff = (int) Math.floor(cutOff);
        // Do the set-up with local variables to determine what the cut-off value should be

        HashMap<Integer, Integer> tempMap = new HashMap<>();
        // The Data Structure of choice here should be a hashmap 
        // We can subsequently then put the number we encounter in the array
        // As the key, and the number of occurrences as the associated value 
        // We need to use a for loop to loop through all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            if (!tempMap.containsKey(nums[i])) {
                tempMap.put(nums[i], 1);
                // This is the first conditional 
                // If the temporary map does NOT contain the key 
                // Then, we would like to set the integer itself as the key
                // And assign it with a value of 1 for the associated value-pair 
            } else {
                // This else would be, if the temporary DOES contain the key
                // We simply want to increment the value
                int occurrence = tempMap.get(nums[i]);
                occurrence++;
                tempMap.put(nums[i], occurrence);
            }
        }
        int result = 0;
        for (int num : tempMap.keySet()) {
            // Now, we are going to be looping through the corresponding 
            // key pairs ONLY in the temporary hashmap that we created
            if (tempMap.get(num) > flooredCutOff) {
                result = num;
            }
        }
        return result;
    }
}