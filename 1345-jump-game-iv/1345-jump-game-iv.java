class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        Queue<int[]> q=new LinkedList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        int step=0;
        q.add(new int[]{0,0});
        boolean[] visited=new boolean[n];
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int i=cell[0];
             step=cell[1];
            visited[i]=true;
            if(i==n-1) break;
            if(i-1>=0 && !visited[i-1]){
                q.add(new int[]{i-1,step+1});
            }
            if(i+1<n && !visited[i+1]){
                q.add(new int[]{i+1,step+1});
            }
            List<Integer> l=map.get(arr[i]);
           for(int ne:l){
             if(!visited[ne]) q.add(new int[]{ne,step+1});
           }
           map.get(arr[i]).clear();
        }
        return step;
    }
}