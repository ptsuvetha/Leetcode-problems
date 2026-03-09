class Solution {
    public int countPrimes(int n) {
        boolean[] primes=new boolean[n];
        for(int i=1;i<n;i++){
            primes[i]=true;
        }
        for(int p=2;p<n;p++){
            if(primes[p]){
                for(int i=p*2;i<n;i+=p){
                    primes[i]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(primes[i]) count++;
        }
        return count;
    }
}