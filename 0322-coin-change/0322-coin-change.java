class Solution {
    public int coinChange(int[] coins, int amount) {
        int l=coins.length;
        Arrays.sort(coins);
        
        int[] dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<amount+1;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<l;i++){
            for(int j=coins[i];j<amount+1;j++){
                if(dp[j-coins[i]]!= Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j-coins[i]]+1,dp[j]);
                   
                }
            }
        }
        if(dp[amount] != Integer.MAX_VALUE) return dp[amount];
       return -1;

    }
}