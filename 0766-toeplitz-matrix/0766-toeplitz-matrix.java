class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        for(int i=0;i<R-1;i++){
            for(int j=0;j<C-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}