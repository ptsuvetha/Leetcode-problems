class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int l=nums.length;
        long sum=0;
        long max=Long.MIN_VALUE;
        long[] prefix=new long[k];
        Arrays.fill(prefix,Long.MAX_VALUE);
        prefix[k-1]=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];             
            int r=i%k;               

            if(prefix[r]!=Long.MAX_VALUE){
                max=Math.max(max,sum-prefix[r]);   
            }

            prefix[r]=Math.min(prefix[r],sum);     
        }
        
        return max==Long.MIN_VALUE? 0:max;
    }
}
