class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=0;
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int row=1;row<m;row++){
            for(int col=1;col<n;col++){
                dp[row][col]=dp[row-1][col]+dp[row][col-1];
            }
        }
        return dp[m-1][n-1];
    }
}