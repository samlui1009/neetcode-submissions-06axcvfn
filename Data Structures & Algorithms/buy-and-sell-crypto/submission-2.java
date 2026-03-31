class Solution {
    public int maxProfit(int[] prices) {
        // We know we need to return back an Integer result, which is going to be 
        // the maximum profit that can be achieved 
        int maxProf = 0;
        // Initialize a variable, with the value of 0 first 
        // This gives off the pattern of a Two-Pointer problem 
        int sell = 0;
        int buy = 1;
        // These set up the "pointer" positions of the Integer array for the prices we see 
        while (buy < prices.length) {
            if (prices[sell] < prices[buy]) {
                int profit = prices[buy] - prices[sell];
                maxProf = Math.max(profit, maxProf);
            } else {
                sell = buy;
            }
            buy++;
        }
        return maxProf;
    }
}
