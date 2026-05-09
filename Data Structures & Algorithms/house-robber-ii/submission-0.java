class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        return Math.max(robRange(nums, 0, n - 2),robRange(nums, 1, n - 1));
    }
    
    private int robRange(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(end, nums, dp, start);
    }
    
    private int helper(int i, int[] nums, int[] dp, int start) {
        if (i < start) return 0;
        if (dp[i] != -1) return dp[i];
        
        int rob = helper(i - 2, nums, dp, start) + nums[i];
        int notRob = helper(i - 1, nums, dp, start);
        return dp[i] = Math.max(rob, notRob);
    }
}