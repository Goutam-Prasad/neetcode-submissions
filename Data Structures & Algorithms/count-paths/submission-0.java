class Solution {
    public int uniquePaths(int rows, int columns) {

        return uniquePathsHelper(rows-1,columns-1);
        
    }

    private int uniquePathsHelper(int rows,int columns){
        if(rows<0||columns<0) return 0;

        if(rows==0 && columns==0) return 1;

        int leftDirection=uniquePathsHelper(rows,columns-1);
        int upDirection=uniquePathsHelper(rows-1,columns);
        int totalWays=leftDirection+upDirection;
        return totalWays;
    }
}
