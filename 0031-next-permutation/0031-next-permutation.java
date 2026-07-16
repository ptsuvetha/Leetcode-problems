class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=0;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                pivot=nums[i];
                break;
            }

        }
        if(ind!=-1){
        for(int i=n-1;i>ind;i--){
            if(pivot<nums[i]){
                int t=nums[ind];
                nums[ind]=nums[i];
                nums[i]=t;
                break;
            }
        }
        }
        reverse(nums,ind+1,n-1);
    }
    private static void reverse(int[] nums,int i,int j){
        while(i<=j){
            int t =nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}