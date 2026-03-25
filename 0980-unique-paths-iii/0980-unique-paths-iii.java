class Solution {
   
    int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}}; 
    private int dfs(int[][] grid,int row,int col,boolean[][] visited,int cnt,int visitedc){
        if(grid[row][col]==2){
            return visitedc==cnt+1? 1:0;
        }
        int paths=0;
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0 && adjR<grid.length && adjC>=0 && adjC<grid[0].length){
                if(!visited[adjR][adjC] && grid[adjR][adjC]==0||grid[adjR][adjC]==2){
                    paths+=dfs(grid,adjR,adjC,visited,cnt,visitedc+1);
                }
                
            }
            
        }
        visited[row][col]=false;
        return paths;
    }
    public int uniquePathsIII(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int cnt=0;
        int startrow=0,startcol=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==0) cnt++;
                else if(grid[i][j]==1){
                    startrow=i;
                    startcol=j;
                }
            }
        }
         boolean visited[][]=new boolean[grid.length][grid[0].length];
        int ans=0;
        ans+=dfs(grid,startrow,startcol,visited,cnt,0);
        return ans;
       

    }
}