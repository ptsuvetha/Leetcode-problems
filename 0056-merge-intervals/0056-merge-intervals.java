class Solution {
    public int[][] merge(int[][] intervals) {
        int R=intervals.length;
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> lis=new ArrayList<>();
        int[] start=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(start[1]>=intervals[i][0]){
                start[1]=Math.max(start[1],intervals[i][1]);
            }
            else{
                lis.add(start);
                start=intervals[i];
            }

        }
        lis.add(start);
        return lis.toArray(new int[lis.size()][]);
    }
}