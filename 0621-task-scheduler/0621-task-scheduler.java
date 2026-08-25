class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len=tasks.length;
        int maxfreq=0,countmax=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(var entry:map.entrySet()){
            maxfreq=Math.max(maxfreq,entry.getValue());
        }
        for(var entry:map.entrySet()){
            if(maxfreq==entry.getValue()){
                countmax++;
            }
        }
        int res=Math.max(len,(maxfreq-1)*(n+1)+countmax);
        return res;
    }
}