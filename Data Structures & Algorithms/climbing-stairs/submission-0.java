public class Solution {
    public int climbStairs(int n) {
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    return helper(n,dp);
    }

 private int helper(int n, int[] memo) {
        // Base cases
        if (n <= 1) return 1;
        if (n == 2) return 2;
        
        // Check if already computed
        if (memo[n] != -1) {
            return memo[n];
        }
        
        // Compute and store in memo
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}