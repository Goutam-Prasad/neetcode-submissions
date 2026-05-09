class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int minCoins = findMinCoins(coins, amount,dp);
        
        return (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
    }
    
    private int findMinCoins(int[] coins, int amount,int []dp) {
        if (amount == 0) {
            return 0;
        }
        if(amount<0) return Integer.MAX_VALUE;

        if(dp[amount]!=-1){
            return dp[amount];
        }
        int minCoins = Integer.MAX_VALUE;
        
        for (int coin : coins) {
            if (amount - coin >= 0) {
                int coinsNeeded = findMinCoins(coins, amount - coin,dp);
                if (coinsNeeded != Integer.MAX_VALUE) {
                    minCoins = Math.min(minCoins, 1 + coinsNeeded);
                }
            }
        }
        
        return dp[amount]=minCoins;
    }
}