class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(solve(nums,0,n-2),solve(nums,1,n-1));
    }
    private static int solve(int[] nums,int start,int end){
        int p1=0,p2=0;
        for(int i=start;i<=end;i++){
            int take=p2+nums[i];
            int skip=p1;
            int curr=Math.max(take,skip);
            p2=p1;
            p1=curr;
        }
        return p1;
    }
}