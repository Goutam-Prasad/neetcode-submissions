class Solution {
    public int uniquePaths(int rows, int columns) {

        int dp[][]=new int[rows][columns];
        for(int row[]:dp){
        Arrays.fill(row,-1);
        }

        return uniquePathsHelper(rows-1,columns-1,dp);
        
    }

    private int uniquePathsHelper(int rows,int columns,int dp[][]){
        if(rows<0||columns<0) return 0;

        if(rows==0 && columns==0) return 1;

        if(dp[rows][columns]!=-1){
            return dp[rows][columns];
        }

        int leftDirection=uniquePathsHelper(rows,columns-1,dp);
        int upDirection=uniquePathsHelper(rows-1,columns,dp);
        int totalWays=leftDirection+upDirection;
        return dp[rows][columns]=totalWays;
    }
}
