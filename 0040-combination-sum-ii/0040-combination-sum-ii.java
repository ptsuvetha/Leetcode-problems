class Solution {
    private void findCombinations(int[] arr,int target,int ind,List<List<Integer>> ans, List<Integer> res){
       
            if(target==0){
                ans.add(new ArrayList<>(res));
                return;
            }
           
        
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            res.add(arr[i]);
            findCombinations(arr,target-arr[i],i+1,ans,res);
            res.remove(res.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
}