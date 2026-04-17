class Solution {
    public int minDistance(String word1, String word2) {
        int R=word1.length(),C=word2.length();
        int[][] dp=new int[R+1][C+1];
        for(int row=0;row<=R;row++){
            dp[row][0]=row;
        }
        for(int col=0;col<=C;col++){
            dp[0][col]=col;
        }
        for(int row=1;row<=R;row++){
            for(int col=1;col<=C;col++){
                if(word1.charAt(row-1)==word2.charAt(col-1)){
                    dp[row][col]=dp[row-1][col-1];
                }
                else{
                    dp[row][col]=1+Math.min(dp[row-1][col-1],Math.min(dp[row][col-1],dp[row-1][col]));
                }
            }
        }
        return dp[R][C];
    }
}