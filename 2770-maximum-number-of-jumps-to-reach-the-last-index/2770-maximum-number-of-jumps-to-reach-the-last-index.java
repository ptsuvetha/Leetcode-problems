class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        
        int[] dp=new int[n];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(dp[i]==Integer.MIN_VALUE) continue;
           for (int j=i+1;j<n;j++){
            int diff=Math.abs(nums[j]-nums[i]);
            if(j>i && diff<=target){
                dp[j]=Math.max(dp[i]+1,dp[j]);
            }
           }
        }
        return dp[n-1]==Integer.MIN_VALUE? -1:dp[n-1];
    }
}