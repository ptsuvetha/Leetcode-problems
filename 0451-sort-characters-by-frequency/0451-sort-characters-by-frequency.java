class Solution {
    public String frequencySort(String s) {
        int l=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxheap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(map.entrySet());
        StringBuilder sb=new StringBuilder();
        while(!maxheap.isEmpty()){
            Map.Entry<Character,Integer> entry=maxheap.poll();
            char ch=entry.getKey();
            Integer count=entry.getValue();
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}