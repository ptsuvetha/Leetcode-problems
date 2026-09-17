class Solution {
    private int Possible(int[] bloomDay,int t,int k){
        int cnt=0,total=0;
        for(int num:bloomDay){
            if(num<=t){
                cnt++;
            }
            else{
                total+=(cnt/k);
                cnt=0;
            }
        }
        total+=(cnt/k);
        return total;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int num:bloomDay){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Possible(bloomDay,mid,k)>=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}