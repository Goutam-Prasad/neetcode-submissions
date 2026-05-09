class Solution {
    public int[] productExceptSelf(int[] nums) {

        int ar[]=new int[nums.length];
        int count=0;
        int mul=1;
        for(int x:nums){
            if(x==0){
                count++;
            }else{
                mul*=x;
            }
        }
if(count>1){
    return ar;
}
else{
    for(int i=0; i<nums.length;i++){
        if(nums[i]==0){
            ar[i]=mul;
        }else{
            if(count==0){
                ar[i]=mul/nums[i];
            }
        }
    }
}
return ar;
        
    }
}  
