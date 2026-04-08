class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int i=1;
        int cnt=1,maxlen=1;
        while(i<nums.length){
           if(nums[i]==nums[i-1]+1){
            cnt++;
           }
           else if(nums[i]==nums[i-1]){
            i++;
            continue;
           }
           else{
            maxlen=Math.max(maxlen,cnt);
            cnt=1;
           }
           i++;
        }
        maxlen=Math.max(maxlen,cnt);
        return maxlen;
    }
}