class Solution {
    public int maxProfit(int[] prices) {
        // This seems like a two-pointer method
        // Set up a variable, maxProf, which is what we should be returning
        int maxProf = 0;
        // We initialize the variable to be 0 first
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                maxProf = Math.max(maxProf, sell - buy);
            }
        }
        return maxProf;
    }
}
