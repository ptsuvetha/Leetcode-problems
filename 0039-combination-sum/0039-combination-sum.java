class Solution {
    private void findCombinations(int i,int[] nums,int target,List<List<Integer>> ans, List<Integer> res){
        if(i==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        if(nums[i]<=target){
            res.add(nums[i]);
            findCombinations(i,nums,target-nums[i],ans,res);
            res.remove(res.size()-1);
        }
        findCombinations(i+1,nums,target,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        findCombinations(0,candidates,target,ans,res);
        return ans;
    }
}