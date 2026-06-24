class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> ans=new ArrayList<>();
        int curr=1;
        for(int i=0;i<arr.length;){
            if(arr[i]!=curr){
                ans.add(curr);
            }
            if(arr[i]==curr){
                i++;
            }
            curr++;
        }
        if(ans.size()<k){
            return arr[arr.length-1]+(k-ans.size());
        }
        return ans.get(k-1);

    }
}