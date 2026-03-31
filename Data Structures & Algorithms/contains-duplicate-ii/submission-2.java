class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean res = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    res = true;
                    return res;
                }
            }
        }
        return res;
    }
}
// Time Complexity: O(n^2) = Quadratic = NOT GOOD! :'(