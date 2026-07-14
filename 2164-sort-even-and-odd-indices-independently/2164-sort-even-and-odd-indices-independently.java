class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            flag=false;
            for(int j=1;j<n-2;j+=2){
                
                    if(nums[j]<nums[j+2]){
                        int t=nums[j];
                        nums[j]=nums[j+2];
                        nums[j+2]=t;
                        flag=true;
                    }
                
            }
            if(flag==false) break;
        }
        flag=false;
        for(int i=0;i<n-1;i++){
            flag=false;
            for(int j=0;j<n-2;j+=2){
              
                    if(nums[j]>nums[j+2]){
                        int t=nums[j];
                        nums[j]=nums[j+2];
                        nums[j+2]=t;
                        flag=true;
                    }
                
            }
            if(flag==false) break;
        }
        return nums;
    }
}