class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean flag=false;
        int n=arr.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[arr.length];
        q.add(start);
        while(!q.isEmpty()){
            int e=q.poll();
            visited[e]=true;
            if(arr[e]==0){
                flag=true;
                break;
            }
            if(e+arr[e]<n && !visited[e+arr[e]]){
                q.add(e+arr[e]);
            }
            if(e-arr[e]>=0&& !visited[e-arr[e]]){
                q.add(e-arr[e]);
            }
        }
        return flag;
    }
}