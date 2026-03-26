class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int position=0,sum=0,total=0;
        for(int i=0;i<gas.length;i++){
            sum+=(gas[i]-cost[i]);
            if(sum<0){
                total+=sum;
                sum=0;
                position=i+1;
                
            }
        }
        total+=sum;
        return total>=0? position:-1;
    }
}