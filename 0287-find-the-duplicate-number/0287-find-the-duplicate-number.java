class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(var entry: map.entrySet()){
            if(entry.getValue()>=2){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}