class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> smap=new HashMap<>();
        Map<Character,Integer> tmap=new HashMap<>();
        int slen=s.length();
        int tlen=t.length();
        int formed=0;
        if(slen<tlen) return "";
        for(char ch:t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        int left=0,fins=0,finalend=-1;
        int minlen=Integer.MAX_VALUE;
        int req=tmap.size();
        for(int right=0;right<slen;right++){
            char ch=s.charAt(right);
            if(tmap.containsKey(ch)){
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                if(smap.get(ch).equals(tmap.get(ch))) formed++;
            }
            while(formed==req){
                int len=right-left+1;
                if(len<minlen){
                    minlen=len;
                    fins=left;
                    finalend=right;
                }
            
            char remove=s.charAt(left);
            if(tmap.containsKey(remove)){
                smap.put(remove,smap.get(remove)-1);
                if(tmap.containsKey(remove)&& smap.get(remove)<tmap.get(remove)) formed--;
                
            }
            left++;
            }
            
            
        }
        return finalend==-1? "":s.substring(fins,finalend+1);
    }
}