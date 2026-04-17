class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int N=cost.length;
        if(N==1) return cost[0];
        if(N==2) return Math.min(cost[0],cost[1]);
        int[] dp=new int[N+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<N;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[N-1],dp[N-2]);

    }
}