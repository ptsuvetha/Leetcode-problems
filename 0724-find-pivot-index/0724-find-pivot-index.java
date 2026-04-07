class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(left==sum) return i;
            left+=nums[i];
        }
        return -1;
    }
}