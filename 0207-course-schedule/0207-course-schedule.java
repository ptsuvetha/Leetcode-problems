class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            for(int j=0;j<prerequisites[i].length;j++){
                graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
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
        List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo.add(node);
            for(int ele:graph.get(node)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
        }
        if(topo.size()==numCourses){
            return true;
        }
        return false;
    }
}