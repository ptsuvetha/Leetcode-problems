class Solution {
    private int CanDivide(int[] nums,int d){
        int sum=0;
        for(int n:nums){
            sum+=(n+d-1)/d;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1,high= 0;
        for(int num:nums){
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(CanDivide(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}