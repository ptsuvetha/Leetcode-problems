class Solution {
    int[][] dir=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    private boolean search(int row,int col,char[][] board,String word,int ind,boolean visited[][]){
        if(ind==word.length()-1){
            return true;
        }
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int adjR=row+dir[i][0];
            int adjC=col+dir[i][1];
            if(adjR>=0 && adjR<board.length && adjC>=0 && adjC<board[0].length && ind+1<word.length()){
                if(!visited[adjR][adjC] && board[adjR][adjC]==word.charAt(ind+1)){
                    if(search(adjR,adjC,board,word,ind+1,visited))
                        return true;
                }
            }
            
        }
        visited[row][col]=false;
        return false;
        

    }
    public boolean exist(char[][] board, String word) {
        int R=board.length;
        int C=board[0].length;
        boolean[][] visited=new boolean[R][C];
        int ind=0;
        boolean flag=false;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]==word.charAt(0)){
                    if(search(row,col,board,word,ind,visited))
                        return true;
                }
            }
           
        }
        return false;
    }
}