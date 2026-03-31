class Solution {
    public int maxProfit(int[] prices) {
        // Pseudocode:
        // The problem is that we have an Integer 
        // Array of prices 
        // We want to maximize our returns 
        // There is a possibility we can make NO transactions, so 
        // The return result can be 0 
        // Can we subsequently assume that there will be at least 2 elements in the integer array?

        // We can make use of the 2-pointer strategy 
        // One pointer should be pointing to the most optimal buy day 
        // And another should traverse through the Integer array of prices 
        
        int buyPtr = 0;
        // I initialize it at 0, because that should be the starting day or referring to prices[0]
        int sellPtr = 1;
        // I initialize this at 1, because we are making comparisons in the buy/sell days
        // It does not make sense to set the sellPtr at 0, because then we're just comparing the same price 
        // At the same index 
        int maxProfit = 0;
        // We also need to initialize another variable called maxProfit, which is the final maximized profit returning price 
        // Note, we also set it to 0 since there's also a possibility we don't buy/sell and return 0 

        // I think what we can do next is to use the sellPtr as the traversing one, since it needs to 
        // Do calculations between the buy and sell
        while (sellPtr < prices.length) {
            // We need to calculate the current profit we can make first based off what we see
            if (prices[buyPtr] < prices[sellPtr]) {
                int currProfit = prices[sellPtr] - prices[buyPtr];
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                buyPtr = sellPtr;
                // This if condition stipulates that we would only update the maximum profit 
                // If, indeed, the calculation shows we are maximizing our profits 
            } 
            sellPtr++;
            // Otherwise, the sellPointer will still need to traverse until the end
        }
        return maxProfit;
        // Finally, we should just return back the maximum profit
    }
}
