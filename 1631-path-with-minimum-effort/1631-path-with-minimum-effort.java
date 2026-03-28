class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)-> a[0]-b[0]);
        int R=heights.length;
        int C=heights[0].length;
        int[][] dist=new int[R][C];
        heap.add(new int[]{0,0,0});
        for(int row[]:dist) Arrays.fill(row,Integer.MAX_VALUE);
        dist[0][0]=0;
        int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        int effort=0;
        while(heap.size()!=0){
            int[] cell=heap.poll();
            effort=cell[0];
            int row=cell[1];
            int col=cell[2];
            if(row==R-1 && col==C-1) return effort;
            for(int i=0;i<4;i++){
                int adjR=row+diff[i][0];
                int adjC=col+diff[i][1];
                if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
                    int e=Math.abs(heights[row][col]-heights[adjR][adjC]);
                    int neweff=Math.max(e,effort);
                    if(neweff<dist[adjR][adjC]){
                        dist[adjR][adjC]=neweff;
                        heap.add(new int[]{neweff,adjR,adjC});
                    }
                }
            }
        }
        return 0;
    }
}