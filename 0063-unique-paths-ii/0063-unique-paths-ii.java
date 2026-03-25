class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int R=obstacleGrid.length;
        int C=obstacleGrid[0].length;
        int[][] dp=new int[R][C];
        if(obstacleGrid[0][0]==1) return 0;
        dp[0][0]=1;
        for(int row=1;row<R;row++){
            if(obstacleGrid[row][0]!=1 && dp[row-1][0]!=0){
                dp[row][0]=1;
            }
            else{
                dp[row][0]=0;
            }
            
        }
        for(int col=1;col<C;col++){
            if(obstacleGrid[0][col]!=1 && dp[0][col-1]!=0){
                dp[0][col]=1;
            }
            else{
                dp[0][col]=0;
            }
        }
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                if(obstacleGrid[row][col]!=1){
                    dp[row][col]=dp[row-1][col]+dp[row][col-1];
                }
                else{
                    dp[row][col]=0;
                }
            }
        }
        return dp[R-1][C-1];
    }
}