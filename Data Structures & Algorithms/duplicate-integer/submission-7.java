class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
                // We map the current number that we see in the array
                // As the key, followed by the value of 1 as the 
                // Associated pair for now since that's the first time
                // Occurrence that we have seen it
            } else {
                int occurrence = map.get(num);
                occurrence++;
                map.put(num, occurrence);
            }
        }

        boolean res = false;
        for (int currNum : map.keySet()) {
            if (map.get(currNum) > 1) {
                res = true;
                return res;
            }
        }
        return res;
    }
}