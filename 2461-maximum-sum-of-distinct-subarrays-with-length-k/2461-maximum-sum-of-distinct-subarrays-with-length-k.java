class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,maxsum=0;
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            if(j-i+1>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k && map.size()==k){
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}