class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a,b) -> b[0]-a[0]);
        String res[]=new String[n];
        String[] medals={"Gold Medal","Silver Medal","Bronze Medal"};
        int rank=1;
        for(int i=0;i<n;i++){
            maxheap.offer(new int[]{score[i],i});
        }
        
        while(!maxheap.isEmpty()){
            int top[]=maxheap.poll();
            int i=top[1];
            if(rank<=3){
                res[i]=medals[rank-1];
            }
            else{
            res[i]=String.valueOf(rank);
          }
          rank++;
        }


        
        return res;
    }
}