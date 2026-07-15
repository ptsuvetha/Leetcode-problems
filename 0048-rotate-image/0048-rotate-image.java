class Solution {
    private void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<=j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        for(int i=0;i<R;i++){
            for(int j=i+1;j<C;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<R;i++){
            reverse(matrix[i]);
        }
    }
}