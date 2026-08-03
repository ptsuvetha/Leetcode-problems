public class Node{
    int r;
    int c;
    int s;
    Node(int r,int c,int s){
        this.r=r;
        this.c=c;
        this.s=s;
    }
}
class Solution {
    
    public int[][] updateMatrix(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        int[][] ans=new int[R][C];
        //Arrays.fill(ans,-1);
        Queue<Node> q=new LinkedList<>();
        int[][] dir=new int[][]{{0,-1},{1,0},{0,1},{-1,0}};
        int step=0;
        boolean[][] visited=new boolean[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(mat[row][col]==0){
                    q.add(new Node(row,col,step));
                    visited[row][col]=true;
                }
            }
        }
        while(!q.isEmpty()){
            Node cell=q.poll();
            int row=cell.r;
            int col=cell.c;
            int dist=cell.s;
            ans[row][col]=dist;
            for(int i=0;i<4;i++){
                int adjR=row+dir[i][0];
                int adjC=col+dir[i][1];
                if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
                    if(!visited[adjR][adjC]){
                        q.add(new Node(adjR,adjC,dist+1));
                        visited[adjR][adjC]=true;
                    }
                }
            }

        }      
        
      return ans;          
    }
}