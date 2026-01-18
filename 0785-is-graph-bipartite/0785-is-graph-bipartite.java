class Solution {
    private boolean check(int node,List<List<Integer>> adj,int V,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=0;
        while(!q.isEmpty()){
            int element=q.poll();
           
            for(int i:adj.get(element)){
                if(color[i]==-1){
                    color[i]=1-color[element];
                    q.add(i);
                }
                else if(color[i]==color[element]){
                    return false;
                }
            }
           
        }
         return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
            adj.get(i).add(graph[i][j]);
            }
        }
        int V=graph.length;
        int[] color=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(check(i,adj,V,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
}