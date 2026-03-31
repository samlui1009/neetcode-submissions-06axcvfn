class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int val = map.get(num);
                val++;
                map.put(num, val);
            }
        }

        boolean toReturn = false;
        
        for (int currNum : map.keySet()) {
            if (map.get(currNum) > 1) {
                toReturn = true;
                return toReturn;
            }
        }
        return toReturn;
    }
}