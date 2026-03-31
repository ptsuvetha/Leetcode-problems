class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums) sum += num;
        
        // Edge cases
        if((sum + target) % 2 != 0 || Math.abs(target) > sum) {
            return 0;
        }
        
        int s = (sum + target) / 2;
        
        // DP array
        int[] dp = new int[s + 1];
        dp[0] = 1;
        
        for(int num : nums) {
            for(int j = s; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        
        return dp[s];
    }
}