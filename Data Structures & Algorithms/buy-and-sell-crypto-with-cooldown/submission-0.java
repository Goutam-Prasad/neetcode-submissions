class Solution {
    public int maxProfit(int[] prices) {
        return maxProfitHelper(prices, 0);
    }
    
    private int maxProfitHelper(int[] prices, int day) {
        if (day >= prices.length) {
            return 0;
        }
        
        int skip = maxProfitHelper(prices, day + 1);
        
        int maxProfit=skip;
        for (int sellDay = day + 1; sellDay < prices.length; sellDay++) {
            int profit = prices[sellDay] - prices[day];
            int futureProfit = maxProfitHelper(prices, sellDay + 2);
            int pick=profit+futureProfit;
            
            maxProfit = Math.max(maxProfit, pick);
        }
        
        return maxProfit;
    }
}