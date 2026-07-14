class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        while(i<n &&j<n){
            if(nums[i]!=0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
            i++;
        }
    }
}