class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> twoSum=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            
            int sum=target-nums[i];
            if(twoSum.containsKey(sum)){
                return new int[]{twoSum.get(sum),i};
            }else{
                twoSum.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
