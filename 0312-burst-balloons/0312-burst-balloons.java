class Solution {
    public int maxCoins(int[] nums) {
       int n=nums.length;
       int[][] dp=new int[n+2][n+2];
       int maxi=0,cost=0;
       int arr[]=new int[n+2];
       arr[0]=1;
       arr[n+2-1]=1;
       for(int i=0;i<n;i++){
        arr[i+1]=nums[i];
       }
       for(int len=1;len<=n;len++){
       for(int i=1;i<=n-len+1;i++){
            int j=i+len-1;
            if(i>j) continue;
            maxi=0;
            for(int ind=i;ind<=j;ind++){
                cost=dp[i][ind-1]+(arr[i-1]*arr[ind]*arr[j+1])+dp[ind+1][j];
                maxi=Math.max(cost,maxi);
            }
            dp[i][j]=maxi;
        }
       }
       return dp[1][n];
        
    }
}