class Solution {
    private void solve(int N,int row,List<List<String>> res,boolean[] rf,boolean[] cf,boolean[] t1f,boolean[] t2f,char[][] board)
    {
       if(row==N){
            List<String> ans=new ArrayList<>();
            for(int r=0;r<N;r++){
                StringBuilder rwst=new StringBuilder();
                for(int col=0;col<N;col++){
                    if(board[r][col]=='Q'){
                        rwst.append('Q');
                    }
                    else{
                        rwst.append('.');
                    }
                }
                ans.add(rwst.toString());
            }
            res.add(ans);
            return;
       }
       for(int col=0;col<N;col++){
        if(rf[row] || cf[col] || t1f[row+col] || t2f[N-1-row+col]){
            continue;
        }
        rf[row]=true;
        cf[col]=true;
        t1f[row+col]=true;
        t2f[N-1-row+col]=true;
        board[row][col]='Q';
        
        solve(N,row+1,res,rf,cf,t1f,t2f,board);
        //backtrack
        rf[row]=false;
        cf[col]=false;
        t1f[row+col]=false;
        t2f[N-1-row+col]=false;
        board[row][col]='.';
       } 
        
    }
    public List<List<String>> solveNQueens(int N) {
        boolean[] rf=new boolean[N];       
       boolean[] cf=new boolean[N];
       boolean[] t1f=new boolean[2*N-1];
       boolean[] t2f=new boolean[2*N-1];
       char board[][]=new char[N][N];
        List<List<String>> res=new ArrayList<>();
        solve(N,0,res,rf,cf,t1f,t2f,board);
        return res;

    }
    
}