class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int stringLength1=text1.length();
        int stringLength2=text2.length();

        int dp[][]=new int [stringLength1][stringLength2];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        return longestCommonSubsequenceHelper(text1,text2,0,0,dp);
        
    }

    private int longestCommonSubsequenceHelper(String text1, String text2,int i,int j,int dp[][]){
        
        if(i>=text1.length()||j>=text2.length()){
            return 0;
        }

        if(text1.charAt(i)==text2.charAt(j)){
            return 1+longestCommonSubsequenceHelper(text1,text2,i+1,j+1,dp);
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j]=Math.max(longestCommonSubsequenceHelper(text1,text2,i+1,j,dp),
        longestCommonSubsequenceHelper(text1,text2,i,j+1,dp));
    }
}
