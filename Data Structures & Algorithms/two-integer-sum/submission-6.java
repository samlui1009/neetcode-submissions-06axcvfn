class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // In this case, you would want to put the current number 
        // We see in the array as the key 
        // And its index as the associated value 
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // Once we've put ALL of the numbers into the hashmap with 
        // Their associated values, we can then loop through it again
        // To calculate the difference 
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }
        }
        return new int[0];
    }
}

