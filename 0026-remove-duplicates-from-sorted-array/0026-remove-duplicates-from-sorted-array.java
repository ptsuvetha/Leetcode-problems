class Solution {
    public int removeDuplicates(int[] nums) {
       int k=1;
       for(int i=1;i<nums.length;i++){
         if(nums[i]!=nums[k-1]){
            nums[k]=nums[i];
            k++;
         }
       }
       return k;
    }
}