class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int N=nums.length;
        int sum=0;
        int left=0,right=0;
        double avg=0,maxavg=Double.MIN_VALUE;
        if(N==1) {
           double ans=nums[0];
           return ans;
        }
       
        for(;right<N;right++){
            sum+=nums[right];
          
            while(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            maxavg=Math.max(sum,maxavg);
        }
        return (double)maxavg/k;
    }
}