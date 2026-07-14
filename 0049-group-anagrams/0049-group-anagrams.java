class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] s=str.toCharArray();
            Arrays.sort(s);
            String skey=String.valueOf(s);
            map.computeIfAbsent(skey,key-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}