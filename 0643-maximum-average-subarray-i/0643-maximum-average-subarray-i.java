class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int N=nums.length;
        int sum=0;
        int left=0,right=0;
        double avg=0,maxavg=Integer.MIN_VALUE;
       
        for(;right<N;right++){
            sum+=nums[right];
          
            while(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k){
            maxavg=Math.max(sum,maxavg);
            }
        }
        return (double)maxavg/k;
    }
}