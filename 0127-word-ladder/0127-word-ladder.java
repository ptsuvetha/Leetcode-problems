class Pair{
   String s;
   int step;
   Pair(String s,int step){
    this.s=s;
    this.step=step;
   } 
}
class Solution {
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Queue<Pair> q=new LinkedList<>();
       Set<String> set=new HashSet<>(wordList);
       q.add(new Pair(beginWord,1));
       set.remove(beginWord);
       while(!q.isEmpty()){
         Pair p=q.poll();
         String word=p.s;
         int dis=p.step;
         if(word.equals(endWord)) return dis;
          
         for(int i=0;i<word.length();i++){
            for(char ch='a';ch<='z';ch++){
                char[] rep=word.toCharArray();
                rep[i]=ch;
                String replace=new String(rep);
                if(set.contains(replace)){
                    set.remove(replace);
                    q.offer(new Pair(replace,dis+1));
                }
            }
         }
       }
      return 0;  
    }
}