class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],dp[0]);
        for(int i=2;i<n;i++){
            int sum=nums[i]+dp[i-2];
            dp[i]=Math.max(sum,dp[i-1]);

        }
        return dp[n-1];
    }
}