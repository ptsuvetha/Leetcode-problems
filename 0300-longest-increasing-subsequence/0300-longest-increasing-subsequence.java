class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int pos=list.size();
            int left=0,right=list.size()-1;
            while(left<=right){
            int mid=left+(right-left)/2;
            if(list.get(mid)>=nums[i]){
                pos=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }

            }
            if(pos==list.size()){
                list.add(nums[i]);
            }
            else{
                list.set(pos,nums[i]);
            }
            
            
        }
        return list.size();
    }
}