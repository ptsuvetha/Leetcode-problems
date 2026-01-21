class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
          
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
}

        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int j:graph.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] topo=new int[numCourses];
        int i=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[i++]=node;
            for(int ele:graph.get(node)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
        }
        if(i==numCourses){
            return topo;
        }
        int[] arr={};
        return arr;
    }
}