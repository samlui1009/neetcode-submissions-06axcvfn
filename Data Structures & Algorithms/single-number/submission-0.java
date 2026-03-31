class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> tempMap = new HashMap<>();
        for (int num : nums) {
            if (!tempMap.containsKey(num)) {
                tempMap.put(num, 1);
                // Puts the current num in the NON-empty 
                // Integer array with an associated value of 1 
            } else {
                int count = tempMap.get(num);
                count++;
                tempMap.put(num, count);
            }
        }
        int toReturn = 0;

        for (int curr : tempMap.keySet()) {
            if (tempMap.get(curr) == 1) {
                toReturn = curr;
            }
        }
        return toReturn;
    }
}
