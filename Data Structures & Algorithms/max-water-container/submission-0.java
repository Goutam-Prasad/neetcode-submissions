class Solution {
    public int maxArea(int[] heights) {

        int max=0;
        int start=0;
        int size=heights.length;
        int end=size-1;
        while(start<end){
            int dist=end-start;
            max=Math.max(max,Math.min(heights[start],heights[end])*dist);
            if(heights[start]>=heights[end]){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}
