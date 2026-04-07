class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int leftprod=1;
       int[] ans=new int[n];
       for(int i=0;i<n;i++){
        ans[i]=leftprod;
        leftprod*=nums[i];
       } 
       int rightprod=1;
       for(int i=n-1;i>=0;i--){
        ans[i]*=rightprod;
        rightprod*=nums[i];
       }
       return ans;
    }
}