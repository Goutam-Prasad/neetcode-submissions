class Solution {
    public int lengthOfLIS(int[] nums) {
         int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = findLIS(nums, i);
            maxLength = Math.max(maxLength, length);
        }
        
        return maxLength;
        
    }

 private int findLIS(int[] nums, int index) {
        int maxLength = 1;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                int lengthFromNext = findLIS(nums, i);
                maxLength = Math.max(maxLength, 1 + lengthFromNext);
            }
        }
        return maxLength;
    }

}
