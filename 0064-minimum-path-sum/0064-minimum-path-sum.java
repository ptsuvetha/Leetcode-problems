class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length,C=grid[0].length;
        int dp[][]=new int[R][C];
        dp[0][0]=grid[0][0];
        //special treament for first row
        for(int col=1;col<C;col++){
            dp[0][col]=dp[0][col-1]+grid[0][col];
        }
        for(int row=1;row<R;row++){

            dp[row][0]=grid[row][0]+dp[row-1][0];
        }
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                dp[row][col]=grid[row][col]+Math.min(dp[row-1][col],dp[row][col-1]);
            }
        }
     return dp[R-1][C-1];   
    }
}