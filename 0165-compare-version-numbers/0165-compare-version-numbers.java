class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int l=Math.max(s1.length,s2.length);
        for(int i=0;i<l;i++){
            int t1=i<s1.length ? Integer.parseInt(s1[i]):0;
            int t2=i<s2.length ? Integer.parseInt(s2[i]):0;
        
        if(t1>t2) return 1;
        else if(t1<t2) return -1;
        }
        return 0;
        
    }
}