class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int R=points.length;
        int C=points[0].length;
        HashMap<int[],Integer> map=new HashMap<>();
        for(int[] point:points){
                int dist=distance(point);
                map.put(point,dist);
            }
        
        PriorityQueue<Map.Entry<int[],Integer>> minheap=new PriorityQueue<>((a,b)-> Integer.compare(a.getValue(),b.getValue()));
        for(Map.Entry<int[],Integer> entry:map.entrySet()){
            minheap.offer(entry);
        }
        int result[][]=new int[k][2];
        for(int i=0;i<k;i++){
            result[i]=minheap.poll().getKey();
        }
        return result;
    }
    private int distance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}