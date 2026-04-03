class Solution {
    private void findsubsets(int i,int[] arr,List<List<Integer>> ans,List<Integer> res){
        ans.add(new ArrayList<>(res));
        for(int ind=i;ind<arr.length;ind++){
            if(ind!=i && arr[ind]==arr[ind-1])continue;
            res.add(arr[ind]);
            findsubsets(ind+1,arr,ans,res);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        findsubsets(0,nums,ans,res);
        return ans;
    }
}