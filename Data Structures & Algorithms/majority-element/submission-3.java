class Solution {
    public int majorityElement(int[] nums) {
        int arrayLength = nums.length;
        int divided = arrayLength/2;
        int cutOff = (int) Math.floor(divided);

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

        int result = 0; 
        for (int currNum : map.keySet()) {
            if (map.get(currNum) > cutOff) {
                result = currNum;
                return result;     
            }
        }
        return result;
    }
}