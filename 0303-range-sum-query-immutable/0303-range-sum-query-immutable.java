class NumArray {
    int[] prefixsum;
    public NumArray(int[] nums) {
        int n=nums.length;
        prefixsum=new int[n+1];
        prefixsum[0]=0;
        for(int i=0;i<n;i++){
            prefixsum[i+1]=prefixsum[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixsum[right+1]-prefixsum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */