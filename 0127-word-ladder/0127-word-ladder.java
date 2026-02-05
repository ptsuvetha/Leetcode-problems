class Pair{
    String first;
    int second;
    Pair(String first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(String s:wordList){
            set.add(s);
        }
        q.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!q.isEmpty()){
            String root=q.peek().first;
            int steps=q.peek().second;
            q.poll();
            if(root.equals(endWord)) return steps;
            for(int i=0;i<root.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] replace=root.toCharArray();
                    replace[i]=ch;
                    String newword=new String(replace);
                    if(set.contains(newword)){
                        set.remove(newword);
                        q.add(new Pair(newword,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}