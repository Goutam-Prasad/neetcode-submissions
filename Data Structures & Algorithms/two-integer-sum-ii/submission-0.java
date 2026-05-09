class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int first=0;
        int last=numbers.length-1;
        int ar[]=new int[2];

        while(first<last){
            int start=numbers[first];
            int second=numbers[last];
            if(start+second==target){
                ar[0]=first+1;
                ar[1]=last+1;
                return ar;
            }else if(start+second>target){
                last--;
            }else{
                first++;
            }
        }
        return ar;
    }
}
