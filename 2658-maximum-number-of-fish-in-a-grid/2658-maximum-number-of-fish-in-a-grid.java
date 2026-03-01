class Solution {
    static int[][] diff=new int[][]{{1,0},{0,1},{0,-1},{-1,0}};
    private static int dfs(int row,int col,int[][] grid,boolean[][] visited,int R,int C,int count){
        visited[row][col]=true;
        count=grid[row][col];
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
                if(grid[adjR][adjC]!=0 && !visited[adjR][adjC]){
                    count+=dfs(adjR,adjC,grid,visited,R,C,count);
                }
            }
        }
        return count;
    }
    public int findMaxFish(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        boolean[][] visited=new boolean[R][C];
        int sum=0,count=0,maxsum=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]!=0){
                    sum=dfs(row,col,grid,visited,R,C,count);
                    maxsum=Math.max(sum,maxsum);
                }
            }
        }
        return maxsum;
    }
}