class Solution {
    static int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
    private static int bfs(int[][] grid,boolean[][] visited,int R,int C,int step){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,0});
        while(!q.isEmpty()){
            int size=q.size();
            for(int ind=0;ind<size;ind++){
                int[] cell=q.poll();
                int row=cell[0];
                int col=cell[1];
                if(row==R-1 && col==C-1) return step;
                for(int i=0;i<8;i++){
                    int adjR=row+diff[i][0];
                    int adjC=col+diff[i][1];
                    if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && !visited[adjR][adjC] && grid[adjR][adjC]==0){
                        q.add(new int[]{adjR,adjC});
                        visited[adjR][adjC]=true;
                    }
                }
                
            }
            step++;
            
        }
        return -1;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int R=grid.length;
        int C=grid[0].length;
        boolean[][] visited=new boolean[R][C];
        int ans=bfs(grid,visited,R,C,1);
        return ans;
    }
}