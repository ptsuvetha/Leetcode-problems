class Solution {
    public int orangesRotting(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        boolean[][] visited=new boolean[R][C];
        int oranges=0,days=-1;
        Queue<int[]> q=new LinkedList<>();
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]!=0){
                    oranges++;
                }
                if(grid[row][col]==2){
                    q.add(new int[]{row,col});
                    visited[row][col]=true;
                }
            }
        }
        if(oranges==0) return 0;
        int[][] diff=new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        while(!q.isEmpty()){
            days++;
            int size=q.size();
            for(int ind=0;ind<size;ind++){
                oranges--;
                int[] cell=q.poll();
                int row=cell[0];
                int col=cell[1];
                for(int i=0;i<4;i++){
                    int adjR=row+diff[i][0];
                    int adjC=col+diff[i][1];
                    if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && !visited[adjR][adjC] && grid[adjR][adjC]!=0){
                        q.add(new int[]{adjR,adjC});
                        visited[adjR][adjC]=true;
                    }
                }
            }
        }
        if(oranges==0) return days;
        return -1;
    }
}