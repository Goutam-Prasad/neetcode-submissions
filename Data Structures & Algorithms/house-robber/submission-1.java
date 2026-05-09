class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(n,nums,dp);
        
    }

    public int helper(int n, int nums[],int dp[]){
        if(n<=0) return 0;
        if(n==1) return nums[0];
        if(n<=2) return Math.max(nums[n-1],nums[n-2]);

        if(dp[n]!=-1) return dp[n];

        int rob=helper(n-2,nums,dp)+nums[n-1];
        int notRob=helper(n-1,nums,dp);
        return dp[n]=Math.max(rob,notRob);
            }
}
