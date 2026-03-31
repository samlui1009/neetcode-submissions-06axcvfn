class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> tempList = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                tempList.add(num);
            }
        }
        for (int i = 0; i < tempList.size(); i++) {
            nums[i] = tempList.get(i);
            // This allows you to replace the elements within the Integer array with 
            // The elements that we want from the temporary list that we created
        }
        return tempList.size();
        // Finally, we just return the size
    }
}