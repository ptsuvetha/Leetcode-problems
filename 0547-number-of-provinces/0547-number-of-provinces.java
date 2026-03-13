class Solution {
    private static void dfs(int n,int city,int[][] isConnected,boolean[] visited){
        visited[city]=true;
        for(int oth=0;oth<n;oth++){
            if(!visited[oth] && isConnected[city][oth]==1){
                dfs(n,oth,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int provinces=0;
        boolean[] visited=new boolean[n];
        for(int city=0;city<n;city++){
            if(!visited[city]){
                
                dfs(n,city,isConnected,visited);
                provinces++;
            }
        }
        return provinces;
    }
}