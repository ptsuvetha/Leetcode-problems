class Solution {
    int[][] dir=new int[][] {{0,1},{1,0},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    private int update(int[][] board,int row,int col){
        int live=0;
        for(int i=0;i<8;i++){
            int adjR=row+dir[i][0];
            int adjC=col+dir[i][1];
            if(adjR>=0 && adjR<board.length && adjC>=0 && adjC<board[0].length){
               if(board[adjR][adjC]==1 || board[adjR][adjC]==2){
                live++;
               }
            } 
        }
        return live;

    }
    public void gameOfLife(int[][] board) {
        int R=board.length;
        int C=board[0].length;
        
        
       
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
               
                int live=update(board,row,col);
                if(board[row][col]==0 && live==3){
                    board[row][col]=3;
                }
                if(board[row][col]==1 && (live<2 || live>3)){
                    board[row][col]=2;
                }
                
            }
        }
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]==2){
                    board[row][col]=0;
                }
                if(board[row][col]==3){
                    board[row][col]=1;
                }
            }
        }
        
    }
}