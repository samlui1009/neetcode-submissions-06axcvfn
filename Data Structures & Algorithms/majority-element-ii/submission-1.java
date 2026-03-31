class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        // We know for a fact that we will need to return back a List of Integers
        // I'll set up the code needed to instantiate a new ArrayList first

        int listSize = nums.length;
        // Return back the current size of the Integer array that we're given, nums
        // We need to set-up the proper cut-off for this 
        // Cut-off requires us to "floor" the value, so that means we'll need to include an 
        // Additional step to round it
        double cutOff = listSize/3;
        int finalCutOff = (int) Math.floor(cutOff);
        // This does all of the necessary work in order to do so 

        HashMap<Integer, Integer> map = new HashMap<>();
        // We should begin looping through the Integer array at this point
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int val = map.get(num);
                val++;
                map.put(num, val);
            }
        }

        for (int curr : map.keySet()) {
            if (map.get(curr) > finalCutOff) {
                result.add(curr);
            }
        }
        return result;
    }
}