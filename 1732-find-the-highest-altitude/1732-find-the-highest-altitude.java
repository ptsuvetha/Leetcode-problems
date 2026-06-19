class Solution {
    public int largestAltitude(int[] gain) {
        int N=gain.length;
        int[] alt=new int[N+1];
        int ind=0;
        alt[0]=0;
        int max=0;
        for(int i=1;i<=N;i++){
            alt[i]=alt[i-1]+gain[i-1];
            max=Math.max(alt[i],max);
        }
        for(int i=0;i<N+1;i++){
            System.out.println(alt[i]+" ");
        }
        return max;
    }
}