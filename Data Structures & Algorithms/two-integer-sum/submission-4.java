class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            // You can put the current number we see as the key
            // And the index itself as the associated value
        }
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference) && map.get(difference) != i) {
                return new int[]{i, map.get(difference)};
            }
        }

        return new int[0];
    }
}

// Brute Force method = n^2 time complexity, quadratic = NOT the best!
