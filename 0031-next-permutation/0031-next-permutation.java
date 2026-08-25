class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int pivot=-1;
        for(int i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0);
            return;
        }
        int swapind=0;
        for(int i=len-1;i>=0;i--){
            if(nums[pivot]<nums[i]){
                swapind=i;
                break;
            }
        }
        int t=nums[pivot];
        nums[pivot]=nums[swapind];
        nums[swapind]=t;
        reverse(nums,pivot+1);
    }
    private void reverse(int[] arr,int i){
        int j=arr.length-1;
        while(i<j){
            int t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }

    }
}