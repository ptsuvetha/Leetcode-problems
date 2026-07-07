class Solution {
    public long sumAndMultiply(int n) {
        if (n==0) return 0;
        StringBuilder sb=new StringBuilder();
        long length=0;
        long sum=0;
        while(n>0){
            int rem=n%10;
            length++;
            if(rem!=0){
                sb.append(rem);
                sum+=rem;
            }
            n/=10;
        }
        long num = Long.parseLong(sb.reverse().toString());
        num=num*sum;
        return num;


    }
}