class Solution {
    public int subarraySum(int[] nums, int k) {
      int n=nums.length;
      int prefixsum=0,ans=0;
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
        prefixsum+=nums[i];
        if(prefixsum==k) ans++;
        if(map.containsKey(prefixsum-k)){
            ans+=map.get(prefixsum-k);
        }
        map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
      } 
      return ans;  
    }
}