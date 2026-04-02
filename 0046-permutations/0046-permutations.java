class Solution {
    private void permutations(int nums[],List<Integer> res,List<List<Integer>> ans,boolean[] vis){
        if(res.size()==nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++){
        if(vis[i]==false){
            vis[i]=true;
            res.add(nums[i]);
            permutations(nums,res,ans,vis);
            vis[i]=false;
            res.remove(res.size()-1);
        }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        
        permutations(nums,res,ans,vis);
        
        
        return ans;
    }
}